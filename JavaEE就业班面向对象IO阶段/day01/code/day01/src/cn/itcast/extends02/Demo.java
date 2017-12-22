package cn.itcast.extends02;
/*
 *   子父类中 成员变量的访问特点  
 *      
 *      子类中 有自己的成员变量 
 *         第一种情况 如果 成员变量名字 跟 父类中成员变量名字 不一样
 *           是哪个调用那个
 *         第二种情况   如果 成员变量名字 跟 父类中成员变量名字 一样
 *         
 *         变量访问特点  就近原则
 *          
 *               访问变量的时候  先从当前方法内找  
 *                  如果当前方法中定义了 使用当前方法 
 *                  如果当前方法中没有定义 使用 当前类中 成员位置的 
 *                  如果当前类成员位置没有  使用 父类中成员位置
 *             
 */
public class Demo {
   public static void main(String[] args) {
	   
	   // 创建子类对象
	   Zi zi = new Zi();
	   
	   System.out.println(zi.home);// 调用的 父类中定义的属性
	   
	   System.out.println(zi.house);//调用的本类中定义的属性
	   
	   
	   System.out.println("----------------");
	   
//	   System.out.println(zi.num);
	   
	   zi.show();
   }
}
