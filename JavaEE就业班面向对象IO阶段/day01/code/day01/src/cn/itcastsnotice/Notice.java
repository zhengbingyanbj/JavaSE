package cn.itcastsnotice;
/*
 *  类与类间的继承 
 *     只能单继承 不能多继承 
 *     
 *     可以多层继承
 */

class Fu2{
	public void show(){
		System.out.println("吃");
	}
}
class Ye{
	 
	public void method(){
		System.out.println("妖精抓了爷爷");
	}
}
class Fu extends Ye{
	
	public void show(){
		System.out.println("喝");
	}
}
//class Zi extends Fu,Fu2{} 不能多继承

class Zi extends Fu{}

public class Notice {
   public static void main(String[] args) {
	  
	   Zi  zi  = new  Zi();
	   
	   zi.show();
	   
	   zi.method();
   }
}
