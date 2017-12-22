package cn.itcast06.single;
/*
 * 
 * 
 * 1:构造私有  
 *   外界无法new了 
 *   
 * 2:提供 公共的获取方式  静态
 * 
 * 3:定义一个静态变量  
 * 保证  Single对象 只被 创建一次 
 * 
 * 静态的变量 只被加载一次 
 *    private static Single single =  new Single();
 *    
 *    
 *    单例模式 
 *        保证 程序运行中 该类型 有只有一个对象
 *        
 *        饿汉式  类已加载  对象就有了 
 *    
 */
public class Single {
    
	private Single(){}
	
	private static Single single =  new Single();
	
	
	public static Single getInstance(){
		
		return single;
	}
}
