package cn.itcast06.poker;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
   public static void main(String[] args) {
	  /*
	   * 1：准备牌
	   */
//	   1.1创建牌盒对象
	   ArrayList<String> pokerBox = new ArrayList<String>();
	   
//	   1.2 创建花色集合
	   ArrayList<String> colors = new ArrayList<String>();
//	   1.3 创建数字集合
	   ArrayList<String> numbers = new ArrayList<String>();
//	   1.4存入四种花色到花色集合 
	   colors.add("♥");
	   colors.add("♣");
	   colors.add("♠");
	   colors.add("♦");
//	   1.5存入 数字到  数字集合
	   for(int i = 2;i<=10;i++){
		   numbers.add(i+"");
	   }
	   numbers.add("J");
	   numbers.add("Q");
	   numbers.add("K");
	   numbers.add("A");
	   
//	   1.6组合牌  
	   //遍历花色集合
	   for(String color : colors){
		   //拿到花色 要跟每一个数字 结合
		   for(String number : numbers){
			   String card = color+number;
			   //1.7存储到 牌盒中
			   pokerBox.add(card);
		   }
		   
	   }
	   
	   pokerBox.add("小☺");
	   pokerBox.add("大☠");
	   
//	   System.out.println(pokerBox);
	   
	   //2:洗牌 
	    // 产生随机数 两个之间位置交换 
	   //Collections 集合工具类  
	   // shuffer方法  可以完成  list集合的 打乱顺序
	   /*
	    * static void shuffle(List<?> list) 
	    *    使用默认随机源对指定列表进行置换。 	   
	    */
	   Collections.shuffle(pokerBox);
	   
//	   System.out.println(pokerBox);
	   
	   //3 发牌
	   //创建三个玩家集合 和 一个底牌集合
	   ArrayList<String> player1 = new ArrayList<String>();
	   ArrayList<String> player2 = new ArrayList<String>();
	   ArrayList<String> player3 = new ArrayList<String>();
	   ArrayList<String> dipai = new ArrayList<String>();
	   
	   //发牌   发 牌盒中的牌  按照  索引去发的 
	   for(int i = 0;i<pokerBox.size();i++){
		  //索引对应的牌面
		   String card = pokerBox.get(i);
		   
		   if(i>=51){//存储到底牌中
			   dipai.add(card);
		   }else{
			   if(i%3==0){//玩家1
				   player1.add(card);
			   }else if(i%3==1){//玩家2
				   player2.add(card);
			   }else{
				   player3.add(card);
			   }
			   
		   }
	   }
	   
	   
	   System.out.println("令狐冲："+player1);
	   System.out.println("田伯光："+player2);
	   System.out.println("绿竹翁："+player3);
	   System.out.println("底牌："+dipai);
	   
	   
	   
	   
	   
	   
	   
   }
}
