package cn.itcast03.package01;
/*
 * package 关键字 声明包的意思  
 *       必须在有效代码的第一行
 *       
 *       com.baidu.baiduyun.
 *       
 *     
 *       四个访问权限修饰符 
 *              public  protected   默认(default)  private 
 *   同一个类           √       √            √             √
 *   同包子类           √       √            √ 
 *  同包无关类         √       √            √ 
 *  其他包子类         √       √  
 *  其他包无关类     √
 *  
 *  总结  
 *     private    作用在本类中
 *     默认    作用在本类  本包中
 *     protected  作用在本类  本包中  其他包中子类
 *     public     作用在本类  本包中  其他包中子类  其他包其他类
 */
public class Demo {
    // 公共的
	public  void show1(){
		System.out.println("public");
	}
	//受保护的 
	protected void show2(){
		System.out.println("protected");
	}
	//默认的
	void show3(){
		System.out.println("default");
	}
	//私有的
	private void show4(){
		System.out.println("private");
	}
	
	public static void main(String[] args) {
		//创建对象
		Demo d = new Demo();
		
		d.show1();
		d.show2();
		d.show3();
		d.show4();
	}
}
