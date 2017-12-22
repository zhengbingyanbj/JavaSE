package cn.itcast.duotaitransfer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 家    
 * 
 * 养动物  
 * 
 *    向上转型 
 *    
 *    向下转型 
 *    
 *    向下转型的时候 容易出现 类型转换异常  
 *     怎么解决了 
 *     
 *     在做向下转型之前 做一个判断 
 *       判断  该父类引用 是否 指向了  要转成的子类类型
 *       
 *       instanceof
 *       变量名   instanceof  类型
 *       判断 这个变量 是否 属于这个类型
 */
public class Home {
    public static void main(String[] args) {
	   //多态形式  父类引用 指向子类对象  
    	Animal a = new Cat();
    	/*
    	 *   double d = 3;
    	 *    将int类型的3 提升为double  
    	 *    
    	 *    隐式转换
    	 *    
    	 *   Animal a = new Tiger();
    	 *   将子类类型 提升为 父类类型
    	 *    向上转型
    	 */
    	
    	feedAnimal(a);
    	
    	
    	/*
    	 *   double d = 3.0;
    	 *   
    	 *   int i = (int)d;  
    	 *     将double类型d 强制转换成int类型 
    	 *     强制转换
    	 *     
    	 *     将父类类型引用  还原成 对应的子类类型   （父类引用指向谁 还原成谁）
    	 *     Tiger t = (Tiger)a;  
    	 *     
    	 *     向下转型
    	 *       子类类型  变量名 = （子类类型）父类引用;
    	 *     
    	 */
    	if(a instanceof Tiger){//判断a是否指向了Tiger类型对象
    		
    		Tiger t = (Tiger)a;
    		
    		t.daDuner();
    	}
//    	a.daDuner();
    	
    	System.out.println("-------------");
    	
    	if(a instanceof Cat){//判断a是否指向了Cat类型对象
    		
    		Cat c = (Cat)a;
    		
    		c.play();
    	}
    	//ClassCastException 类型转换异常
    	
	}
    
    public static void feedAnimal(Animal a){
    	                        
    	a.eat();
    	a.shout();
    }

}
