package cn.itcast.extendssuper;

public class Demo {
   public static void main(String[] args) {
	  //创建子类对象
	   Chinese c = new Chinese("张学友",30 , "荷兰");
	   
	   System.out.println(c.getName());
	   
	   System.out.println(c.getAddress());
   }
}
