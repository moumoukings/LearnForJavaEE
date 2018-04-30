package program.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSend {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//创建DatagramSocket对象，数据包的发送和接收对象
		DatagramSocket ds = new DatagramSocket();
		//创建InetAddress对象，封装自己的IP地址
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		while(true) {
			byte[] data = sc.nextLine().getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length, inet, 6666);		
			//调用ds对象的方法send，发送数据包
			ds.send(dp);
		}
	}
}
