package cn.itcast01.objecttostring;
/*
 *  toString方法
 *    toString方法返回该对象的字符串表示
 *    该方法源码
 *     public String toString() {
 *      return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *               类名全路径  + @ + 哈希值的十六进制表示形式
 *      
 *      }
 *      
 *      如果没有重写Object中的 toString方法
 *       那么 返回的值  是该对象的 “地址值”
 *       
 *      如果 重写toString方法 
 *        一般 返回值 是  展示 当前对象的内容
 *                               对象中的成员变量
 *                               
 *      快捷键 
 *       alt+shift+s   s
 *       
 *       当我们在输出语句中单独输出对象名的时候 
 *       其实 是调用了该对象的 toString方法 
 */
public class ObjectDemo {
       public static void main(String[] args) {
		    
    	   Object o = new Object();
    	   
    	   System.out.println(o.toString()); 
    	   System.out.println(o);
    	   
    	   Person p = new Person("马金莲",33);
    	   System.out.println(p.toString());
    	   System.out.println(p);
    	   
    	   String s = new String("宋门庆");
    	   System.out.println(s.toString());
    	   System.out.println(s);
    	   
	   }
}
