package cn.itcast07.test;

import java.util.Random;

public class RandomDemo {
   public static void main(String[] args) {
	  
	   Random rd = new Random(2);
	   
	   for (int i = 0; i < 10; i++) {
		   
		   System.out.println(rd.nextInt(10));
	   }
   }
}
