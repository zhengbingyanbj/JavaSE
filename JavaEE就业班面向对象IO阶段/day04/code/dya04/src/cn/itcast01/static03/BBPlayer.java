package cn.itcast01.static03;

public class BBPlayer {
   
	String name;
	static String country;
	
	public void show(){
		System.out.println(name+"�Ĺ�����"+country);
	}
	
    public static void method(){
    	System.out.println("��̬����");
    	
    	System.out.println(country);
    	
    	//System.out.println(name);
    } 
}
