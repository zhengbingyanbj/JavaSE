package cn.itcast05.system;
/*
 *  
 *    垃圾回收器  回收什么呢 
 *    
 *      没有指向的对象
 */
public class SystemDemo2 {
     public static void main(String[] args) {
		//创建对象
    	 Person p = new Person("社会王", 30);
    	 Person p2 = new Person("隔壁王", 33);
    	 
    	 p=null;
    	 p2=null;
    	 
    	 System.gc();
	}
}
