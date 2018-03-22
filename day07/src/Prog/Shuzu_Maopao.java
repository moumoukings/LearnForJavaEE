package Prog;

public class Shuzu_Maopao {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] ar = {2,3,4,5,9};
		//调用数组的逆序方法
		Maopaosort(arr);
		Maopaosort(ar);
		//调用数组的遍历方法
		printArray(arr);
		printArray(ar);

	}
	
	//定义方法，实现冒泡排序（两两比较）
	//无返回值		有参数（数组）
	public static void Maopaosort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			//从内循环开始比较，从索引0开始，每次都在递减
			for(int j = 0; j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
