package exercise.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * UDPSend发送端
 */
public class UDPSend {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		DatagramSocket ds = new DatagramSocket();
		while(true) {
			byte[] bytes = sc.nextLine().getBytes();
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length, inet, 6666);
			ds.send(dp);			
		}
		//ds.close();
	}
}
