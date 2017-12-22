package cn.itcast07.baozhuanglei;
/*
 *   Object a = new Object();
	  Object b = new Object(); 
	  Object c = new Object(); 
	  Object d = new Object(); 
		
	  a = 127;
	  b = 127;
	  c = 128; 
	  d = 128; 
	  
	  System.out.println(a == b); 
	  System.out.println(a.equals(b));
	  System.out.println(a.equals(127)); 
	  System.out.println("--------------------"); 
	  System.out.println(c == d);
	  System.out.println(c.equals(d));
	  System.out.println(c.equals(128));
 */
public class Test {
  public static void main(String[] args) {
	   
//	    Integer a = new Integer(12);
//	    Integer b = new Integer(12);
//	  
//	    System.out.println(a==b);
//	    System.out.println(a.equals(b));
//	    
//	    Integer c = new Integer(200);
//	    Integer d = new Integer(200);
//	  
//	    System.out.println(c==d);
//	    System.out.println(c.equals(d));
	  
	  
	    Integer.valueOf(12);
	    Integer e = 12;// Integer.valeOf(12);
	    Integer f = 12;// Integer.valeOf(12);
	    
	    
	    System.out.println(e==f);
	    
	    Integer g = 200;
	    Integer h = 200;
	    System.out.println(g==h);
	   
	    
	   
   }
}
