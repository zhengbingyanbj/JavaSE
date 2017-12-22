package cn.itcast.overridenotice;

import java.io.FileReader;

/*
 *    重写的注意事项
 *     1：子类重写时  重写的方法 必须 与 被重写的父类中的方法  方法声明（方法名  返回值类型  参数列表）一模一样
 *     
 *     2：子类重写父类方法的权限  必须大于等于 父类方法的权限
 *     
 *      访问 权限  访问修饰符  
 *      
 *       public  > 什么都不写 默认(default)  > private
 */
class Fu{
	
	 void show(){}
	 
//	 private void method(){}
}
class Zi extends Fu{
	
	public void show(){}
	
	public void method(){}
}
public class Notice {
      
}
