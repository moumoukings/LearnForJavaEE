package program.demo4;

import java.io.FileInputStream;
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
		Socket socket = new Socket("127.0.0.1", 8888);
		//获取字节输出流，将数据写向服务器
		OutputStream out = socket.getOutputStream();
		//创建字节输入流，读取本机的图片
		FileInputStream fis = new FileInputStream("D:\\1.png");
		int len = 0;
		byte[] bytes = new byte[1024];
		while((len = fis.read(bytes)) != -1) {
			out.write(bytes,0,len);
		}
		//给服务器写终止序列
		socket.shutdownOutput();
		//读取服务器返回的数据
		InputStream in = socket.getInputStream();
		len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		//关闭资源
		fis.close();
		socket.close();
	}
}
