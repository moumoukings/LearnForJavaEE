package Prog;

public class arraytwo {

	public static void main(String[] args) {
		int[][] arr = {{11,12},{21,22,23},{31,32,33,34}};
		int groupsum = 0;//每个小组总金额
		int sum = 0;//全部小组金额总和
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				groupsum +=arr[i][j];
			}
			System.out.println("第"+(i+1)+"个小组的总金额是："+groupsum);
			sum +=groupsum;
			groupsum = 0;
		}
		System.out.println("所有小组的总金额是："+sum);
	}

}
