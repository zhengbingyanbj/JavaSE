package cn.itcast05.nonameinnerclass;
/*
 *  匿名内部类本质 是一个 实现接口或者继承类的 一个子类对象(没有名字的)
 *  
 *  作用：匿名内部类是创建某个类型子类对象的快捷方式。
 *  
 *  格式：
 *    new 接口或者类(){
 *       重写方法;
 *    };
 *    
 *    定义的匿名内部类有两个含义  
 *       临时定义某一指定类型的子类
 *       定义后即刻创建刚刚定义的这个子类的对象
 */
public class Demo {
   public static void main(String[] args) {
	   
//	   feedAnimal(new Animal());
	   //直接写是不对滴 
	   //需要在包下 创建一个类  叫 Cat类  继承 Animal 重写抽象方法
	   //创建对象  
//	   Animal a = new Cat();
//	   
//	   feedAnimal(a);
	   
	   //使用新的方式    
//	   new Animal(){
//		   //方法重写
//		   public void eat(){
//			   System.out.println("大象吃香蕉");
//		   }
//	   }.eat();
//	   
//	   new Cat().eat();;
	   /*
	    * 
	    new Animal(){
		   //方法重写
		   public void eat(){
			   System.out.println("大象吃香蕉");
		   }
	   };
	   这个整体  是Animal的一个子类对象 
	   
	   相当于  创建了 一个子类 类型  并且完成创建对象
	             Cat类型   new Cat();
	    */
	   
	  Animal aa =  new Animal(){
		   //方法重写
		   public void eat(){
			   System.out.println("大象吃香蕉");
		   }
	   };
	   
	   Animal a = new Cat();
	   
	   feedAnimal(new Cat());
	   
	   feedAnimal(new Animal(){
		   //方法重写
		   public void eat(){
			   System.out.println("大象吃香蕉");
		   }
	   });
   }
   
   public static void feedAnimal(Animal a){
	    
	   a.eat();
   }
}
