package exercise.demo3;

public class b_b {
	public static void main(String[] args) {
		String[] str = {"010","3223","666","7890987","123123"};
		//调用方法，判断字符串数组中有几个字符串对称
		function(str);
	}
	
	//定义方法，实现判断字符串数组中有几个字符串对称
	//返回符合规定字符串的对数
	public static void function(String[] str) {
		//定义常量，记录对数
		int count = 0;
		//将字符串数组中字符逐个取出
		for(int i = 0;i < str.length;i++) {
			//记录数组中每个字符串
			String s = str[i];
			char[] c =new char[s.length()];
			// 这层for循环把字符串转换成字符数组
			for (int j = 0; j < s.length(); j++) {
				char c1 = s.charAt(j);
				c[j] = c1;
			}
			//遍历新数组c
			for(int k = 0;k < c.length;k++) {
				//判断第一个字符与最后一个字符是否相同
				if(c[k] == c[c.length-k-1]) {
					//比较前一半即可
					if(k == c.length/2-1) {
						count++;
						System.out.print(c);
						System.out.println("对称");
						}
				}else {
					System.out.print(c);
					System.out.println("不对称");
					break;
				}
			}
		}
		System.out.println("一共有"+count+"对对称");
	}
}
