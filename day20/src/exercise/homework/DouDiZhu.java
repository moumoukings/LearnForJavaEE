package exercise.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 *  实现模拟斗地主的功能
 *   1. 组合牌
 *   2. 洗牌
 *   3. 发牌
 *   4. 看牌
 */
public class DouDiZhu {
	public static void main(String[] args) {
		//创建Map集合，键是编号，值是点数\
		HashMap<Integer, String> pooker = new HashMap<Integer,String>();
		//创建List集合存储编号
		ArrayList<Integer> pookerNumber = new ArrayList<Integer>();
		//给出13个点数的数组
		String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		//给出花色数组
		String[] colors = {"♠","♥","♣","♦"}; 
		int index = 2;//Map中的key值
		//遍历数组，花色+数字存入Map集合中
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < colors.length; j++) {
				//将卡牌数据存入Map集合中
				pooker.put(index, colors[j]+numbers[i]);
				pookerNumber.add(index);
				index++;
			}
		}
		//单独存储大小王
		pooker.put(0,"大王");
		pookerNumber.add(0);
		pooker.put(1,"小王");
		pookerNumber.add(1);
		//System.out.println(pooker);//查看卡牌是否存储成功
		
		//2.洗牌(将List集合中的编号打乱)
		//调洗牌方法(让编号乱序)
		Collections.shuffle(pookerNumber);
		//System.out.println(pookerNumber);
		
		//3.发牌
		//创建三位玩家和底牌集合
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> dipai = new ArrayList<Integer>();
		//发牌利用集合的索引%3
		for (int i = 0; i < pookerNumber.size(); i++) {
			if( i < 3) {
				dipai.add(pookerNumber.get(i));
			}else if(i % 3 == 0) {
				//发牌给一号玩家
				player1.add(pookerNumber.get(i));
			}else if(i % 3 == 1) {
				//发牌给二号玩家
				player2.add(pookerNumber.get(i));
			}else if(i % 3 == 2) {
				player3.add(pookerNumber.get(i));
			}
		}
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		
		//调用看牌方法
		look("张三", player1, pooker);
		look("李四", player2, pooker);
		look("王五", player3, pooker);
		look("底牌", dipai, pooker);
	}
	
	//4.看牌(遍历List集合，获取元素作为键，然后获取扑克)
	public static void look(String name,ArrayList<Integer> player,HashMap<Integer, String> pooker) {
		System.out.print(name+":");
		for (Integer key : player) {
			String value = pooker.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
