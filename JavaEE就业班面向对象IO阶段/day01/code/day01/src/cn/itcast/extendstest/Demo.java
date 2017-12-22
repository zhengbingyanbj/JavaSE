package cn.itcast.extendstest;
/*
 *   子父类中 成员变量的访问特点  

 *         
 *         变量访问特点  就近原则
 *          
 *               访问变量的时候  先从当前方法内找  
 *                  如果当前方法中定义了 使用当前方法 
 *                  如果当前方法中没有定义 使用 当前类中 成员位置的 
 *                  如果当前类成员位置没有  使用 父类中成员位置
 *            
 *             
 *             this.num 访问本类中的成员变量
 *             
 *             父类中的成员访问 也有关键字 super
 *             
 *             
 */
public class Demo {
   public static void main(String[] args) {
	   
	   // 创建子类对象
	   Zi zi = new Zi();
	   
	  
	   
	   zi.show();
   }
}
