package cn.itcast01.static02;
/*
 * static 状态修饰符 
 *    静态的 （共享的）
 * 
 * static 特点 
 *   1：被static修饰的成员 不再属于某个对象 
 *       属于 类  称为类成员
 *   2：可以被多个对象共享 
 *   3：类初始化(类加载)的时候 ，加载静态成员，优先于对象存在
 *   
 *   
 *   4：使用特点 
 *       static修饰的成员 可以直接通过类名调用
 *       建议使用类名调用
 */
public class Demo {
    public static void main(String[] args) {
		//创建一个对象
    	BBPlayer p1 = new BBPlayer();
    	p1.name = "詹姆斯";
    	p1.country="美国";
    	p1.show();
    	
    	//球员2
    	BBPlayer p2 = new BBPlayer();
    	p2.name = "库里";
    	//p2.country="美国";
    	p2.show();
    	
    	//球员3
    	BBPlayer p3 = new BBPlayer();
    	p3.name="林书豪";
    	//p3.country="美国";
    	p3.show();
    	
    	System.out.println("归化球员");
    	
    	//   派一个人 柳岩   说服他
    	p3.country = "中国";
    	p3.show();
    	
    	p2.show();
    	p1.show();
    	
    	
    	
	}
}
