package exercise.homework2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
 * TCP服务器端
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(6666);
		Socket socket = server.accept();
		
		InputStream in = socket.getInputStream();
		File upload = new File("D:\\百度云盘\\upload");
		if(!upload.exists()) {
			upload.mkdirs();
		}
		
		//防止重名
		String file="JJ"+System.currentTimeMillis()+new Random().nextInt(999999)+".png";
		FileOutputStream fos = new FileOutputStream(upload+File.separator+file);
		
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = in.read(bytes))!=-1) {
			fos.write(bytes, 0, len);
			//fos.flush();
		}
		
		OutputStream out = socket.getOutputStream();
		out.write(":上传成功".getBytes());

		fos.close();
		socket.close();
		server.close();
	}
}
