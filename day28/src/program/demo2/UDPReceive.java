package program.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
	public static void main(String[] args) throws IOException {
		//创建DatagramSocket对象，绑定端口号
		DatagramSocket ds = new DatagramSocket(6666);
		//创建字节数组接收发来的数据
		byte[] data = new byte[1024];
		while(true) {
			//创建数据包对象DatagramPacket
			DatagramPacket dp = new DatagramPacket(data, data.length);
			//调用DatagramSocket对象方法receive()，接收数据放在数据包中
			ds.receive(dp);
			//拆包
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			int len = dp.getLength();
			System.out.println(new String(data,0,len)+"..."+ip+":"+port);
		}
		
		// ds.close();
	}
}
