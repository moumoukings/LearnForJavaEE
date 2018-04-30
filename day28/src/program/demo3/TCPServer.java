package program.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务器端
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象，并绑定端口
		ServerSocket server = new ServerSocket(6666);
		//调用服务器对象方法accept()，获取客户端套接字对象
		Socket socket = server.accept();
		//获取客户端数据，输入流
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = in.read(data);
		System.out.println(new String(data,0,len));
		
		//回馈客户端信息，输出流
		OutputStream out = socket.getOutputStream();
		out.write("服务器收到".getBytes());
		
		//关不资源
		socket.close();
		server.close();
	}
}
