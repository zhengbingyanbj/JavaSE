package cn.itcast07.baozhuanglei;
/*
 *  基本类型      包装类 
 *   
 *   装箱 
 *      基本类型  转换成 包装类  
 *   拆箱
 *     包装类 对象  转换成 基本类型
 */
public class Demo2 {
    public static void main(String[] args) {
		
    	
    	int i = 100;
    	//装箱操作1
    	Integer ii = new Integer(i);//将基本类型i转成 引用（包装）类型  对象ii
	    //装箱操作2
        Integer iii = Integer.valueOf(i);//将基本类型 转换成  引用（包装）类型  对象iii
        
        //拆箱操作
        int i4 = iii.intValue();//将包装类对象 转换成 基本类型i4
        
    }
}
