package Prog;

public class Shuzu_Zheban {

	/*
	   数组的查找功能
	     在一个数组中,找一个元素,是否存在于数组中,如果存在,就返回索引
		 
		 普通查询arr与折半查找ar:
		   找到元素在数组中出现的索引,如果没有这个 元素,结果就是负数
			
	*/
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] ar = {2,3,4,5,9};
		int  a = search(arr, 5);
		int  b = Zheban(ar, 4);
		System.out.print("直接查找的arr数组中该数的索引:"+a+"\n"+"折半查找的ar数组中该数的索引:"+b);
	}
	
	/*
	 * 定义方法，实现数组的折半查找
	 * 有返回值（索引） 	有参数（数组）
	 * 
	 */
	
	//key 指元素
	public static int Zheban(int[] arr,int key) {
		int min = 0,max = arr.length-1,mid = 0; 
		while(min <= max) {
			mid = (min + max)/2;
			if(key > arr[mid]) {
				min = mid + 1;
			}else if(key < arr[mid]) {
				max = mid - 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	/*
	   定义方法,实现数组的普通查询
	   返回值: 索引
	   参数:   数组, 被找的元素
	   
	   实现步骤:
	     1. 遍历数组
		 2. 遍历过程中,使用元素和数组中的元素进行比较
		    如果相同,返回元素在数组中的索引
			如果不同,返回负数
	*/
	public static int search(int[] arr, int key){
		//遍历数组
		for(int i = 0 ; i < arr.length ; i++){
			//数组元素,被查找的元素比较
			if(arr[i] == key){
				//返回索引
				return i;
			}
		}
		return -1;
	}
}
