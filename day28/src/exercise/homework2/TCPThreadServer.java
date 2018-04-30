package exercise.homework2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPThreadServer {
	public static void main(String[] args) throws IOException{		
		ServerSocket server = new ServerSocket(6666);
		while(true) {
			Socket socket = server.accept();
			new Thread(new Upload(socket)).start();
		} 
	}
}
