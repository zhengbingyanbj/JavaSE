package cn.itcast01.staticcode;
/*
 * static修饰的 只能类相关  跟对象无关  只不过对象可以访问（一般也不做）
 * 
 * 静态代码块 
 *     大括号 括起来的内容就称为 代码块
 *     
 *     static{
 *        //可以写逻辑代码 
 *        
 *     }
 *     
 *     位置  ：  
 *         成员位置    类中方法外
 *         
 *      特点 ：
 *        在成员位置  
 *          与类相关  
 *      1：类加载一次  
 *        静态代码块随着类的加载而执行  
 *        在一个程序中只执行一次
 *      2：优先于主方法执行  优先于构造执行   
 *      3: 不管创建多少对象 
 *         不管后面怎么使用 
 *         这个静态代码块只加载一次 
 *   作用：
 *     就是为 类的数据初始化使用        
 *    
 */
public class Demo {
    public static void main(String[] args) {
   
//    	new StaticCode();
//    	new StaticCode();
//    	new StaticCode();
//    	new StaticCode();
//    	new StaticCode();
    	
    	System.out.println(StaticCode.num);
	}
}
