package Prog;
/*
 * 要求：实现数组的逆序
 * 
 * 逆序 不等于 反向遍历
 * 
 * 数组中最远的两个索引，进行位置交换，从而实现数组的逆序
 * 使用的是数组的指针思想
 * 
 */
public class Shuzunixu {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] ar = {2,3,4,5,9};
		//调用数组的逆序方法
		reverse(arr);
		reverse(ar);
		//调用数组的遍历方法
		printArray(arr);
		printArray(ar);
	}

/*
 * 定义方法，实现数组的逆序
 * 无返回值  有参数（数组）
 * 
 */

	public static void reverse(int[] arr) {
		//利用循环，实现数组遍历，遍历时实现最远端换位
		for(int min = 0 , max = arr.length-1;min<max;min++,max--) {
			int temp = arr[min];
			arr[min] = arr[max];
			arr[max] = temp;
		}
	}

/*
 * 定义方法，实现数组的遍历
 * 无返回值  有参数（数组）
 * 
*/
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i = 0;i<arr.length;i++) {
			if(i == arr.length-1) {
				System.out.println(arr[i]+"]");
			}else {
				System.out.print(arr[i]+",");
			}
		}
	}
}
