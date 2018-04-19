package exercise.home_work3;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 键盘输入10个数，放入到数组中：
 * 		1.去除数组中大于10 的数
 * 		2.将剩余的数存入number.txt中
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入十个整数:");
		Scanner sc = new Scanner(System.in);
		//存入10个整数
		int[] arr = new int[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {  
            arr[i] = sc.nextInt();  
            if (arr[i] > 10)  
                count++;  
  
        }  
		sc.close();
		//遍历数组，除去大于10的数，存到新的数组
		int[] arr2 = new int[arr.length - count];
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i]+" ");
			if(arr[i] < 10) {
				//取出小与10的数存入新的数组
				arr2[count++] = arr[i];
			}
			//输出指定数组内容的字符串表示形式
		}
		System.out.println(Arrays.toString(arr2));
		PrintStream ps = new PrintStream("D:\\测试文件夹\\number.txt");
		//FileOutputStream ps = new FileOutputStream("D:\\测试文件夹\\number.txt");//会出现乱码
        for (int i = 0; i < arr2.length; i++) {  
            ps.println(arr2[i]); 
            ps.flush();
        	//ps.write(arr2[i]);
              
        }  
        ps.close();  
	}
}
