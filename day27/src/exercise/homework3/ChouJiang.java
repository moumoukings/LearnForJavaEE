package exercise.homework3;

import java.util.ArrayList;
import java.util.Random;

public class ChouJiang implements Runnable {
	int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
	private int num = 0; 
	
    //主要用来判断是否已经有出现的数了，如果没有出现过就加入数组，如果出现过就跳过，进行下一次循环  
	private ArrayList<Integer> list =  new ArrayList<Integer>();
	private Object obj = new Object();
	
	public void run() {
		
			//利用for循环控制产生中奖的最终人数
			for (int i = 0; i < arr.length; i++) {
				//获取随机索引(判断length长度，length用来控制循环的次数，如果小于0，就说明数组中的元素取完了，循环结束 )
				num = new Random().nextInt(arr.length);
	            // 如果已经包含了相应的数组中的元素下标，就跳过进行下一次循环，没有就添加到数组元素中，接着执行下面的代码。  
				if(list.contains(num)) {
					continue;
				}else {
					list.add(num);
				}
				//休眠一秒
				try {  
	                Thread.sleep(1000);  
	            } catch (InterruptedException e) {  
	                e.printStackTrace();  
	            }  
				synchronized(obj ) {				
					System.out.println(Thread.currentThread().getName()+"又产生了一个"+arr[num]+"元大奖");
				}
			}
		
	}
}
