package cn.itcast06.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;


public class Poker {
	public static void main(String[] args) {
       /*
        * 准备牌
        */
	    //1.1：创建新式牌盒  map集合   键是 编号 值 牌面
		HashMap<Integer, String> pokerMap = new HashMap<Integer,String>();
	    //1.2 创建花色集合 以及 创建数字集合
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> numbers = new ArrayList<String>();
	   //1.3 添加 颜色到 花色集合 添加数组到 数字集合
		Collections.addAll(colors, "♦","♣","♥","♠");
		Collections.addAll(numbers, "3","4","5","6","7","8","9","10","J","Q","K","A","2");
		
		//1.4定义 编号变量
		int index = 1;
		//1.5 遍历 数字 再遍历花色
		for (String number : numbers) {
			 for(String color:colors){
				 //组合牌
				 String card = color+number;
				 //存储到 map中
				 pokerMap.put(index++,card);
			 }
		}
		
		pokerMap.put(index++, "小☺");
		pokerMap.put(index++, "大☠");
		
//		System.out.println(pokerMap);
		
		/*
		 * 洗牌  
		 *   洗编号
		 */
		//2.1获取 编号集合
	     Set<Integer> numberSet = pokerMap.keySet();
		 //我们发现 工具类中需要的 是一种有序的集合 才可以打乱
	     //怎么办 
	     //将set集合中的内容转换到 ArrayList集合中 
	     //这样就有索引了就可以打乱了
	     //2.1.1 创建ArrayList集合
	     ArrayList<Integer> numberList = new ArrayList<Integer>();
	     //2.1.2 将 set集合中所有内容全部转换到 list集合
	     numberList.addAll(numberSet);
	     
	     //2.2 打乱集合顺序 
	     
	     Collections.shuffle(numberList);
	     /*
	      * 发牌 
	      *    创建 三个玩家 接收编号的集合 以及 底牌接收编号的集合
	      */
	     //3.1创建 三个玩家 接收编号的集合 以及 底牌接收编号的集合
	     ArrayList<Integer> noP1 = new ArrayList<Integer>();
	     ArrayList<Integer> noP2 = new ArrayList<Integer>();
	     ArrayList<Integer> noP3 = new ArrayList<Integer>();
	     ArrayList<Integer> noDipai = new ArrayList<Integer>();
	     
	     //3.2 发编号  遍历的就是numberList
	     for(int i = 0;i<numberList.size();i++){//i是 编号的索引 编号是编号 numberList.get(i)
	    	 //先把当前编号获取出来
	    	 Integer number = numberList.get(i);
	    	 if(i>=51){
	    		 //给 底牌的编号集合
	    		 noDipai.add(number);
	    	 }else{
	    		 if(i%3==0){//玩家1的编号集合
	    			 noP1.add(number);
	    		 }else if(i%3==1){//玩家2的编号集合
	    			 noP2.add(number);
	    		 }else{//玩家3的编号集合
	    			 noP3.add(number);
	    		 }
	    	 }
	     }
	     
	     //3.3发好牌
//	     System.out.println(noP1);
//	     System.out.println(noP2);
//	     System.out.println(noP3);
		 //对每个人手里的编号进行排序 
	     Collections.sort(noP1);
	     Collections.sort(noP2);
	     Collections.sort(noP3);
	     
//	     System.out.println(noP1);
//	     System.out.println(noP2);
//	     System.out.println(noP3);
	     
	     /*
	      * 需要将手里的这一堆编号转化牌面
	      *   每个人都需要  
	      *     接收牌面的集合     
	      */
	     //3.4创建三个玩家接收牌面的集合 一个底牌接收牌面集合
	     ArrayList<String>  player1 = new ArrayList<String>();
	     ArrayList<String>  player2 = new ArrayList<String>();
	     ArrayList<String>  player3 = new ArrayList<String>();
	     ArrayList<String>  dipai = new ArrayList<String>();
	     
	     //3.5转换 
	     for(Integer i :noP1){
	    	 // 3.6 根据编号找到 牌面  pokerMap
	    	 String card = pokerMap.get(i);
	    	//添加到对应的 牌面集合中
	    	 player1.add(card);
	     }
	     
	     for(Integer i :noP2){
	    	 // 3.6 根据编号找到 牌面  pokerMap
	    	 String card = pokerMap.get(i);
	    	//添加到对应的 牌面集合中
	    	 player2.add(card);
	     }
	     for(Integer i :noP3){
	    	 // 3.6 根据编号找到 牌面  pokerMap
	    	 String card = pokerMap.get(i);
	    	//添加到对应的 牌面集合中
	    	 player3.add(card);
	     }
	     for(Integer i :noDipai){
	    	 // 3.6 根据编号找到 牌面  pokerMap
	    	 String card = pokerMap.get(i);
	    	//添加到对应的 牌面集合中
	    	dipai.add(card);
	     }
	     
	     System.out.println("丁不四:"+player1);
	     System.out.println("谢烟客:"+player2);
	     System.out.println("丁不三:"+player3);
	     
	    System.out.println("底牌"+dipai);
	     
	     
	     
	     
	     
	     
	     
	     
	}
}
