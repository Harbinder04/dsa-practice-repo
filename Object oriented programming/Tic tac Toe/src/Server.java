import java.io.*;
import java.net.*;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Waiting for a connection...");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Connected to " + clientSocket.getInetAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String[] board = new String[9];
        String turn = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard(out, board);

        out.println("X will play first. Enter a slot number to place X in:");

        String inputLine;
        try {
            while ((inputLine = in.readLine()) != null) {
                int numInput;

                try {
                    numInput = Integer.parseInt(inputLine);
                    if (!(numInput > 0 && numInput <= 9)) {
                        out.println("Invalid input; re-enter slot number:");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    out.println("Invalid input; re-enter slot number:");
                    continue;
                }

                if (board[numInput - 1].equals(String.valueOf(numInput))) {
                    board[numInput - 1] = turn;

                    if (turn.equals("X")) {
                        turn = "O";
                    } else {
                        turn = "X";
                    }

                    printBoard(out, board);
                    winner = checkWinner(board, turn);
                    if (winner != null) {
                        if (winner.equalsIgnoreCase("draw")) {
                            out.println("It's a draw! Thanks for playing.");
                        } else {
                            out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
                        }
                        break;
                    }
                } else {
                    out.println("Slot already taken; re-enter slot number:");
                }
            }

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Print the Tic Tac Toe board to the client's PrintWriter
    private static void printBoard(PrintWriter out, String[] board) {
        out.println("|---|---|---|");
        out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        out.println("|-----------|");
        out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        out.println("|-----------|");
        out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        out.println("|---|---|---|");
    }

    // Check for a winner or draw
    private static String checkWinner(String[] board, String turn) {
        // Implementation of your checkWinner logic here
        // Return "X", "O", "draw", or null if the game is still ongoing
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }

        // To enter the X Or O at the exact place on board.
        return turn + "'s turn; enter a slot number to place " + turn + " in:";
    }
}
