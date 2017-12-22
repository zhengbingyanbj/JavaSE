package cn.itcast01.static03;

public class BBPlayer {
   
	String name;
	static String country;
	
	public void show(){
		System.out.println(name+"的国籍是"+country);
	}
	
    public static void method(){
    	System.out.println("静态方法");
    	
    	System.out.println(country);
    	
    	//System.out.println(name);
    } 
}
