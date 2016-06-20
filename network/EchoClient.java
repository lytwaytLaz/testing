package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-20
 */

public class EchoClient {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("usage: java EchoClient <IP> <port> <message>");
            return;
        }
        //try with resources, meaning socket will auto-close
        try (Socket socket = new Socket(args[0], Integer.parseInt(args[1]))) {
            String message = args[2];

            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println(message);
            writer.flush();

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

