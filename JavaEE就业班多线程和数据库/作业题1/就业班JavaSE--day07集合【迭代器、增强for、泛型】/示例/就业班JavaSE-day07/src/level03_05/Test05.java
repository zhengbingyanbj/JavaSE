package level03_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test05 {

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
		
		// 玩家4
		ArrayList<String> player04 = new ArrayList<String>();
		
		// 玩家已经拿走的牌的索引
		ArrayList<Integer> removePokers = new ArrayList<Integer>();
		
		getPokers(pokers, player01, removePokers);
		getPokers(pokers, player02, removePokers);
		getPokers(pokers, player03, removePokers);
		getPokers(pokers, player04, removePokers);
		
		System.out.println(player01);
		System.out.println(player02);
		System.out.println(player03);
		System.out.println(player04);
		
		// 定义一个数组放四个玩家的点数
		int[] continer = new int[4];
		continer[0] = getPoints(player01);
		continer[1] = getPoints(player02);
		continer[2] = getPoints(player03);
		continer[3] = getPoints(player04);
		
		// 定义最大点数
		int max = 0;
		for (int point : continer) {
			if (max < point) {
				max = point;
			}
		}
		
		System.out.println("四个玩家中最大点数是: " + max);
	}
	
	/**
	 * 根据玩家的牌,计算出点数
	 * @param player
	 * @return
	 */
	public static int getPoints(ArrayList<String> player) {
		int point = 0;
		for (String str : player) {
			if (str.contains("A")) {
				point += 1;
			} else if (str.contains("J")) {
				point += 11;
			} else if (str.contains("Q")) {
				point += 12;
			} else if (str.contains("K")) {
				point += 13;
			} else {
				point += Integer.valueOf(str.substring(1));
			}
		}
		
		return point;
	}
	
	/**
	 * 一个玩家拿2张牌
	 * @param pokers 所有的牌
	 * @param player 玩家
	 * @param removePokers 已经拿走牌的序号
	 */
	public static void getPokers(ArrayList<String> pokers, ArrayList<String> player, ArrayList<Integer> removePokers) {
		Random ran = new Random();
		
		// 如果玩家的牌小于2张,就拿一张
		while (player.size() < 2) {
			// 拿到牌的索引
			int index = ran.nextInt(52);
			// 看这张牌是否有人拿走过
			if (!removePokers.contains(index)) {
				// 这张牌没有被别人拿走.就给玩家
				player.add(pokers.get(index));
				// 这张牌已经被别人拿走,后面的人就不要来拿这张牌
				removePokers.add(index);
			}
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
	}
}
