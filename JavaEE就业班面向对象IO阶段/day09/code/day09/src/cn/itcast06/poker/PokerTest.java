package cn.itcast06.poker;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ♣10, ♠8, ♣K, ♦6, ♣4, ♣2,
 */
public class PokerTest {
  public static void main(String[] args) {
	  
	  ArrayList<String>  list = new ArrayList<String>();
	  
	  Collections.addAll(list, "♣10","♠8","♣K","♦6","♣4","♣2");
	  
	  System.out.println(list);
	  //排序
	  Collections.sort(list);
	  
	  System.out.println(list);
  }
}
