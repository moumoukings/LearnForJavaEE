package exercise.homework2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class Upload implements Runnable{
	private Socket socket;
	public Upload(Socket socket) {
		super();
		this.socket = socket;
	}

	public void run() {
		try {			
			InputStream in = socket.getInputStream();
			File upload = new File("D:\\百度云盘\\upload");
			if(!upload.exists()) {
				upload.mkdirs();
			}
			
			//防止重名
			Random r = new Random();
			String file = "JJ"+System.currentTimeMillis()+r.nextInt(100)+".png";
			FileOutputStream fos = new FileOutputStream(upload+File.separator+file);
			
			byte[] bytes = new byte[1024];
			int len = 0;
			while((len = in.read(bytes))!=-1) {
				fos.write(bytes, 0, len);
				fos.flush();
			}
			
			OutputStream out = socket.getOutputStream();
			out.write(":上传成功".getBytes());
			
			fos.close();
			socket.close();		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
