package Exercise;

public class RemoveArray {
	public static void main(String[] args) {
		int [] array = {2,3,4,5,6};
		show(array);
		array = remove(array, 1);
		show(array);
	}
	
	//通过一个方法来实现:
	//	当给定一个数组和该数组中的某一元素的位置时，
	//	利用算法将该数组中的该位置的元素删除。
	public static int[] remove(int []arr,int index) {
		//定义一个新数组存储删除后的数组
		int[] tem = new int [arr.length-1];
		
		int id = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if(i == index && !flag) {
				flag = true;
				continue;
			}
			tem[id++] = arr[i];
		}
		return tem ;
	}
	public static void show(int [] arr) {
		for (int i = 0; i < arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.err.println();
	}
}
