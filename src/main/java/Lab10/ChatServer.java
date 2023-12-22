package Lab10;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private List<ClientHandler> clients = new ArrayList<>();

    public void start(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started at port: " + port);
            while (true) {
                Socket clientSocket = serverSocket.accept();

                InputStream inputStream = clientSocket.getInputStream();
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                String message = new String(buffer, 0, bytesRead);
                ClientHandler clientHandler = new ClientHandler(clientSocket, message.substring(0, message.indexOf("\n") - 1));
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    private void broadcastMessage(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(sender.username + ": " + message);
            }
        }
    }

    private class ClientHandler implements Runnable {
        private final Socket socket;
        private final BufferedReader reader;
        private final PrintWriter writer;
        private String username;

        public ClientHandler(Socket socket, String username) throws IOException {
            this.socket = socket;
            this.username = username;
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.writer = new PrintWriter(socket.getOutputStream(), true);
        }

        public void run() {
            try {
                System.out.println(username + " joined the chat");
                broadcastMessage(username + " joined the chat", this);

                String clientMessage;
                while ((clientMessage = reader.readLine()) != null) {
                    broadcastMessage(clientMessage, this);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                    clients.remove(this);
                    broadcastMessage(username + " left the chat", this);
                } catch (IOException e) {
                    //e.printStackTrace();
                }
            }
        }

        public void sendMessage(String message) {
            writer.println(message);
        }
    }
}
