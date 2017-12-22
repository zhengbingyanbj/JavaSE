package cn.itcast07.baozhuanglei;

import java.util.ArrayList;

/*
 *  基本类型      包装类 
 *   
 *   装箱 
 *      基本类型  转换成 包装类  
 *   拆箱
 *     包装类 对象  转换成 基本类型
 */
public class Demo3 {
    public static void main(String[] args) {
		
    	
//    	int i = 100;
//    	//装箱操作1
//    	Integer ii = new Integer(i);//将基本类型i转成 引用（包装）类型  对象ii
//	    //装箱操作2
//        Integer iii = Integer.valueOf(i);//将基本类型 转换成  引用（包装）类型  对象iii
//        
//        //拆箱操作
//        int i4 = iii.intValue();//将包装类对象 转换成 基本类型i4
    	
    	/*
    	 * jdk 1.5以后 有了自动装箱 和自动拆箱
    	 *    写法简化 
    	 */
    	Integer ii = 100;//自动装箱
    	//Integer ii = Integer.valueOf(100);
    	
    	int i = ii;//int i = ii.intValue();  自动拆箱
    	
    	
        ArrayList<Integer>  list = new ArrayList<Integer>();
        
        list.add(new Integer(2));
        list.add(123);
    }
}
