package cn.itcast.extendssuper;
/*
 * 子类对象初始化完成之前 完成父类（对象）数据 初始化
 */
public class Chinese extends Person{
    //成员变量
	private String address;
	//空参构造
	public Chinese(){
		super();//子类对象初始化之前 完成父类初始化时 选择的空参构造
	}
	//满参
	public Chinese(String name,int age,String address){
		super(name,age);//子类对象初始化完成之前 完成父类（对象）数据 初始化
		      //要完成父类对象初始化 那么必须要知道使用父类中的哪个构造参与初始化
		      //咱们写的这句话super(name,age)就是说明了 其父类初始化时用的构造
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
