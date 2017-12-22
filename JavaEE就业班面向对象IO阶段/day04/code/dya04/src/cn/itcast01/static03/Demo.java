package cn.itcast01.static03;
/*
 * static 状态修饰符 
 *    静态的 （共享的）
 * 
 * 使用特点 
 *       static修饰的成员 可以直接通过类名调用
 *       建议使用类名调用 也可以通过对象调用
 *       
 *       以后静态直接通过类名调用
 *       
 *       
 *       静态 加载的时候 
 *        还没有对象 
 *        
 *       两个注意
 *         1：静态中 不能有this关键字
 *         2: 静态只能访问静态
 */
public class Demo {
    public static void main(String[] args) {
		//创建一个对象
//    	BBPlayer p1 = new BBPlayer();
//    	p1.name = "詹姆斯";
//    	BBPlayer.country="美国";
//    	p1.show();
    	
    	BBPlayer.method();
    	
    	
	}
}
