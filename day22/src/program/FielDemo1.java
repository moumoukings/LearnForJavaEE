package program;

import java.io.File;

public class FielDemo1 {
	public static void main(String[] args) {
		File file = new File("D:\\abc");
		File[] fileArr = file.listFiles(new MyFilter());
		for (File f : fileArr) {
			System.out.println(f);
		}
	}
}
