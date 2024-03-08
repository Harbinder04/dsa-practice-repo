import java.util.*;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        boolean win = false;

            while (!win) {
                display(board);
                if (checkDraw(board)) {
                    System.out.println(" Game is over. Nobody win!!");
                    break;
                } else {
                    System.out.println("Player " + player + " enter : ");
                    int r = sc.nextInt();
                    int c = sc.nextInt();
                    if (board[r][c] == ' ') {
                        board[r][c] = player;
                        win = haveWon(board, player);
                        if (win) {
                            display(board);
                            System.out.printf(player + " is winner!");
                        } else {
                            player = (player == 'X') ? 'O' : 'X';
                        }
                    } else {
                        System.out.println("Invalid move. Try again!");
                    }
            }
        }
    }

    private static boolean checkDraw(char[][] board) {
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[0].length; col++){
                if (board[row][col] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean haveWon(char[][] board, char player) {
       for (int row = 0; row < board.length; row++){
          if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
              return true;
          }
       }
       for (int col = 0; col < board[0].length; col++){
           if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
               return true;
           }
       }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        return false;
    }

    public static void display(char[][] board){
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0][0] + " | "
                + board[0][1] + " | " + board[0][2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[1][0] + " | "
                + board[1][1] + " | " + board[1][2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[2][0] + " | "
                + board[2][1] + " | " + board[2][2]
                + " |");
        System.out.println("|---|---|---|");
    }
}
