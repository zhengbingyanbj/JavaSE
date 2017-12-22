package cn.itcast01.objectequals02;
/*
 *  类 Object 是类层次结构的根类。
 *    每个类都使用 Object 作为超类。
 *    所有对象都实现这个类的方法。
 *    
 *    任何类 都直接或间接继承了Object,那么Object定义的可继承功能，任何类都有
 *    
 *    任何对象 都可以调用 Object中可继承的方法
 *        
 *        
 *        boolean equals(Object obj) 
 *        
 *          指示其他某个对象是否与此对象“相等”。 
 *       public boolean equals(Object obj) {
 *            return (this == obj);
 *       }    
 *       
 *       Object中对equals中 实现 是  比较两个对象的地址值 
 *       
 *       如果没有重写Object中equals方法  那么 对象比较是地址值
 *       如果 重写Object中的equals方法 那么一般来说  比较的是对象中的内容
 *                                             比较的是成员变量
 *       
 *       快捷方式 
 *        alt+shift+s h    
 */
public class ObjectDemo {
       public static void main(String[] args) {
		    
    	
    	   
    	   Person p1 = new Person("尼古拉斯赵四",44);
    	   Person p2 = new Person("郭杰森·斯坦达",45);
    	   
    	   System.out.println("p1.equals(p2):"+p1.equals(p2));
    	   System.out.println("--------------------");
    	   
    	   Person p3 = new Person("尼古拉斯赵四",44);
    	   Person p4 = new Person("尼古拉斯赵四",44);
    	   System.out.println("p3.equals(p4):"+p3.equals(p4));
    	   
    	   
    	  
	   }
}
