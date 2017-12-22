package cn.itcast.override;

public class BoomRiceFlowerPhone extends Phone{
    
	/*
	 * 对打电话 进行方法重写  
	 *    假如  子类方法中 需要 执行 父类中的某个功能 
	 *      这个时候可以使用super关键字 
	 *        super 访问当前类的父类中内容
	 *        
	 *             super.成员变量  父类中成员变量
	 */
	public void callSo(String name){
//		System.out.println("给"+name+"打电话");
		super.callSo(name);
		System.out.println("----注意-5-4-3-2-1-！！boom!!!");
	    System.out.println("吃爆米花");
	}
}
