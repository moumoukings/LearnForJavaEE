package exercise.homework4;

import java.util.Arrays;
import java.util.Random;

public class Shuangse {
	
	//红色号码池
	private static String[] redpool = {"01", "02", "03", "04", "05", "06", "07", "08", "09",   
	            "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",  
	            "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33"};  
	  
	//蓝色号码池
	private static String[] bluepool = {"01", "02", "03", "04", "05", "06", "07",
	            "08", "09", "10", "11", "12", "13", "14", "15", "16"};  
	//最终球号
	private static String [] resultBall = null  ;
	public Shuangse() {
		super();
	}
	 public static String[] getball(String[] red, String[] blue) {
		 Random x = new Random();
		 
		 //对于红球部分
		 resultBall = new String[7];
		 String[] strred = new String[6];//存储红球
		 String strblue = "";//存储蓝球
		 int index = 0;
		 for (int i = 0; i < strred.length; i++) {
			index = x.nextInt(33);
			strred[i] = red[index];
			for (int j = 0; j < i; j++) {
				//当这个红球号码已经存在时，不重复存入
				if(strred[j] == red[index]) {
					i--;
					break;
				}
			}
		}
		 
		 //对于蓝球部分
		 int index2 = x.nextInt(16);
		 strblue = blue[index2];
		 
		 //从指定红球数组中复制一个数组，复制从0位置开始，到最终双色球数组(resultBall)的6位置结束
		 //一共复制了7个红球
		 System.arraycopy(strred, 0, resultBall, 0, 6);
		 resultBall[resultBall.length-1]=strblue;
		 return resultBall;
	 }
	 public static String getResult(){
		 	//将数组以字符串输出
	        return Arrays.toString(getball(redpool, bluepool));  
	    }  
}
