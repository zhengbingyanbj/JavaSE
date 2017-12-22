package cn.itcast07.baozhuanglei;
/*
 * 
 * int---对应的包装类 
 *      Integer 
 *      
 *      基本类型 ---字符串
 *         +""
 *         
 *      字符串  转换成 对应的 基本类型
 *      
 *        通过基本类型包装类中 
 *          static xxx parseXxx(String s)
 *      
 */
public class Demo {
  public static void main(String[] args) {
//	  int i = 2147122222;
//	  
//	  System.out.println(Integer.MAX_VALUE);
	  
	  String s = "345";
	  
	  int i = Integer.parseInt(s);
	  
	  String ss = "true";
	  
	  boolean b = Boolean.parseBoolean(ss);
	  
	  
	  
  }
}
