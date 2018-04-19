package exercise.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/*
 *  实现模拟斗地主的功能
 *   1. 组合牌
 *   2. 洗牌
 *   3. 发牌
 *   4. 看牌
 */
public class DouDizhu_1 {
	public static void main(String[] args) {
		//创建HashMap key ==> 编号，value ==> 扑克
		HashMap<Integer, String> puke = new HashMap<Integer,String>();
		//创建List集合存储编号
		ArrayList<Integer> pukeNumber = new ArrayList<Integer>();
		//给出点数和花色数
		String [] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		String [] colors = {"♠","♣","♥","♦"};
		int index = 2;
		//遍历数组
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < colors.length; j++) {
				puke.put(index, colors[j]+numbers[i]);
				pukeNumber.add(index);
				index++;
			}
		}
		//存储大小鬼
		puke.put(0, "大王");
		pukeNumber.add(0);
		puke.put(1, "小王");
		pukeNumber.add(1);
		
		//洗牌
		Collections.shuffle(pukeNumber);
		//System.out.println(pukeNumber);
		
		//发牌
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> dipai = new ArrayList<Integer>();
		//发牌利用 index%3
		for (int i = 0; i < pukeNumber.size(); i++) {
			if(i < 3){
				dipai.add(pukeNumber.get(i));
			}else if(i%3 == 0) {
				//发给玩家1
				player1.add(pukeNumber.get(i));
			}
			else if(i%3 == 1) {
				player2.add(pukeNumber.get(i));
			}
			else if(i%3 == 2) {
				player3.add(pukeNumber.get(i));
			}
		}
		//玩家手牌排序
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		//看牌
		look("一号",player1, puke);
		look("二号",player2, puke);
		look("三号",player3, puke);
		look("底牌",dipai, puke);
	}
	public static void look(String name,ArrayList<Integer> player,HashMap<Integer, String> puke) {
		//遍历List集合
		System.out.print(name+":");
		Iterator<Integer> it = player.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = puke.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
