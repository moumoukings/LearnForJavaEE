package program.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * 客户端
 */
public class TCPClient {
	public static void main(String[] args) throws IOException {
		//创建Socket对象，链接服务器
		Socket socket = new Socket("127.0.0.1", 6666);
		//获取字节输出流，将数据写向服务器
		OutputStream out = socket.getOutputStream();
		out.write("服务器OK".getBytes());
		//读取服务器返回的数据
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = in.read(data);
		System.out.println(new String(data,0,len));
		//关闭资源
		socket.close();
	}
}
