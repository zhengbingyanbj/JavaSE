package level03_04;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 1.完成斗地主案例
 * 2.增加需求:哪个玩家拿到大王,就需要拿底牌
 */
public class Test04 {

	public static void main(String[] args) {
		// 一副完整的牌
		ArrayList<String> pokers = new ArrayList<String>();
		
		// 添加牌
		addPokers(pokers);
		
		// 洗牌
		washPokers(pokers);
		
		// 发牌
		dealPokers(pokers);
	}
	
	/*
	 * 发牌
	 * 3个玩家使用3个ArrayList来存放牌
	 * 底牌也使用ArrayList来存放
	 */
	public static void dealPokers(ArrayList<String> pokers) {
		// 玩家1
		ArrayList<String> player01 = new ArrayList<String>();
		
		// 玩家2
		ArrayList<String> player02 = new ArrayList<String>();
		
		// 玩家3
		ArrayList<String> player03 = new ArrayList<String>();
		
		// 底牌
		ArrayList<String> diPai = new ArrayList<String>();
		
		for (int i = 0; i < pokers.size(); i++) {
			String poker = pokers.get(i);
			
			if (i >= 51) {
				diPai.add(poker);
			} else if (i % 3 == 0) {
				player01.add(poker);
			} else if (i % 3 == 1) {
				player02.add(poker);
			} else if(i % 3 == 2) {
				player03.add(poker);
			}  
		}
		
		// 看哪个玩家拿到大王,就将底牌也拿走
		if (player01.contains("大王")) {
			System.out.println("玩家1拿到大王,底牌也拿走");
			player01.addAll(diPai);
		} else if (player02.contains("大王")) {
			System.out.println("玩家2拿到大王,底牌也拿走");
			player02.addAll(diPai);
		} else if (player03.contains("大王")) {
			System.out.println("玩家3拿到大王,底牌也拿走");
			player03.addAll(diPai);
		}
		
		// 将每个玩家的牌打印出来
		System.out.println("玩家1的牌:");
		for (String p : player01) {
			System.out.print(p + " ");
		}
		
		System.out.println();
		System.out.println("玩家2的牌:");
		for (String p : player02) {
			System.out.print(p + " ");
		}
		
		System.out.println();
		System.out.println("玩家3的牌:");
		for (String p : player03) {
			System.out.print(p + " ");
		}
		
		System.out.println();
		System.out.println("底牌牌:");
		for (String p : diPai) {
			System.out.print(p + " ");
		}
	}
	
	/*
	 * 洗牌
	 */
	public static void washPokers(ArrayList<String> pokers) {
		// 洗牌,其实就是将ArrayList中的元素顺序打乱
		Collections.shuffle(pokers);
	}

	// 添加牌
	public static void addPokers(ArrayList<String> pokers) {
		String[] colors = {"♣", "♦", "♠", "♥"};
		String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for (int i = 0; i < colors.length; i++) {
			// 获取花色
			String color = colors[i];
			
			for (int j = 0; j < numbers.length; j++) {
				// 获取数字
				String number = numbers[j];
				
				// 拼接成一张牌
				String poker = color + number;
				
				// 添加到一副牌中
				pokers.add(poker);
			}
		}
		
		// 添加大小王
		pokers.add("小王");
		pokers.add("大王");
	}
}
