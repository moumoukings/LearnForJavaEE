package program_StringBuffer;
/*
 * 	使用StringBuffer实现打印数组
 */
public class StringBuffer_Test {
	public static void main(String[] args) {
		int [] arr = {3,54,2,6,78,34,8,33};
		String s = function(arr);
		System.out.println(s);
	}

	public static String function(int [] arr) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				buffer.append(arr[i]).append("]");
			} else {
				buffer.append(arr[i]).append(",");
			}
		}
		return buffer.toString();
	}
}
