package cn.itcast04.genericinteface;
/*
 *  泛型方法定义格式  
 *  
 *       修饰符 <泛型的内容> 返回值类型 方法名(参数列表){}
 *
 */
public class GenericMethod{
    
	public <T> void show(T  t){
		
		System.out.println(t.getClass());
	}
	
     public <T> T show2(T  t){
		
		return t;
	}
	
}
