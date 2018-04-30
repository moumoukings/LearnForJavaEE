package exercise.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * UDP接收端
 */
public class UDPReceive {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(6666);
		byte[] data = new byte[1024];
		while(true) {
			DatagramPacket dp = new DatagramPacket(data, data.length);
			ds.receive(dp);
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			int len = dp.getLength();
			System.out.println(new String(data,0,len)+"   "+ip+":"+port);			
		}
		//ds.close();
	}
}
