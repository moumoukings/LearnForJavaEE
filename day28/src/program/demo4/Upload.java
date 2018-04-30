package program.demo4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class Upload implements Runnable {
	private Socket socket;

	public Upload(Socket socket) {
		super();
		this.socket = socket;
	}
	public void run() {
		try {	
			// 获取客户端数据，输入流
			InputStream in = socket.getInputStream();
			File upload = new File("D:\\百度云盘\\upload");
			if (!upload.exists()) {
				upload.mkdirs();
			}
			// 防止重名覆盖
			String filename = "JJ" + System.currentTimeMillis() + new Random().nextInt(999999) + ".png";
			FileOutputStream fos = new FileOutputStream(upload + File.separator + filename);
			byte[] bytes = new byte[1024];
			int len = 0;
			while ((len = in.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
	
			// 回馈客户端信息，输出流
			OutputStream out = socket.getOutputStream();
			out.write("上传成功".getBytes());

			// 关不资源
			fos.close();
			socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
