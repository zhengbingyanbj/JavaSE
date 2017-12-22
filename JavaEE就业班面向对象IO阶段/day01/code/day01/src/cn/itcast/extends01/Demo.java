package cn.itcast.extends01;
/*
 * 继承的操作 
 *    class 子类  extends 父类{ }
 *    
 *     父类内容子类可以使用
 *     
 *     子类中可以有自己的特有内容
 */
public class Demo {
   public static void main(String[] args) {
	   // 创建子类对象
	   WangSicong wsc = new WangSicong();
	   
	   System.out.println(wsc.money);
	   
	   wsc.wanDa();
	   
	   wsc.pandaTV();
   }
}
