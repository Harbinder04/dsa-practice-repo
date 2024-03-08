import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 12345);

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        try {
            String serverMessage;
            while ((serverMessage = in.readLine()) != null) {
                System.out.println(serverMessage);

                // Check if the game has ended
                if (serverMessage.startsWith("It's a draw!") || serverMessage.startsWith("Congratulations!")) {
                    break;
                }

                String userInputLine = userInput.readLine();
                out.println(userInputLine);
            }

            in.close();
            out.close();
            userInput.close();
            clientSocket.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
