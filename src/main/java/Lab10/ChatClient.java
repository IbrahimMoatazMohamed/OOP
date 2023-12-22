package Lab10;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
//        if (args.length < 2) {
//            System.out.println("Usage: java ChatClient <username> <server-ip>");
//            return;
//        }

//        String username = args[0]
//        String serverIP = args[1];
        String serverIP = "127.0.0.1";
        int serverPort = 8888;
        System.out.print("Enter your username: ");
        try {
            Socket socket = new Socket(serverIP, serverPort);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            Scanner message = new Scanner(System.in);


            Thread receiveThread = new Thread(() -> {
                String serverMessage;
                try {
                    while ((serverMessage = reader.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiveThread.start();

            String clientMessage;
            while ((clientMessage = message.readLine()) != null) {
                writer.println(clientMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
