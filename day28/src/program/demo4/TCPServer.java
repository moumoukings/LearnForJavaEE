package program.demo4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
 * 服务器端
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象，并绑定端口
		ServerSocket server = new ServerSocket(8888);
		//调用服务器对象方法accept()，获取客户端套接字对象
		Socket socket = server.accept();
		//获取客户端数据，输入流
		InputStream in = socket.getInputStream();
		File upload = new File("D:\\百度云盘\\upload");
		if(!upload.exists()) {
			upload.mkdirs();
		}
		//防止重名覆盖
		String filename="JJ"+System.currentTimeMillis()+new Random().nextInt(999999)+".png";
		FileOutputStream fos = new FileOutputStream(upload+File.separator+filename);
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len=in.read(bytes))!=-1) {
			fos.write(bytes, 0, len);
		}
		
		//回馈客户端信息，输出流
		OutputStream out = socket.getOutputStream();
		out.write("上传成功".getBytes());
		
		//关不资源
		fos.close();
		socket.close();
		server.close();
	}
}
