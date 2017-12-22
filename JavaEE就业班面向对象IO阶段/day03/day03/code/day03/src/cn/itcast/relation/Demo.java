package cn.itcast.relation;
/*
 *  类和类  
	    继承关系 
	        只能单继承 不能多继承 可以多层继承

           类和接口
	    实现关系
	       可以单实现  也可以多实现
	       
	接口和接口 
	    继承关系   
	    可以单继承 也可以多继承 
	    
	    
	    一个类在继承一个类的基础上可以实现多个接口
	    
	    public final class String extends Object implements Serializable, Comparable<String>, CharSequence
	    
	 接口与父类的功能可以重复，均代表要具备某种功能，并不冲突。
 */
public class Demo {
   public static void main(String[] args) {
	  WangYun wy = new WangYun();
	  
	  wy.taobao();
	  wy.wanda();
	  
	  wy.footballteam();
    }
}
