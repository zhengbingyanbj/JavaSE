package com.itheima.level3_03;

/*
 8.定义会表演的财务部员工类(ActedTreasurer)  继承 Treasurer实现 Actor接口
	a)实现抽象方法 play
		i.输出格式: 工号为100的行财务部员工林思意在表演魔术
	b)提供空参,带参构造方法
 */
public class ActedTreasurer extends Treasurer implements Actor{
//a)实现抽象方法 play
// i.输出格式: 工号为100的行开发部员工林思意在表演魔术
	public void play(){
		System.out.println("工号为"+getId()+"的行财务部员工"+getName()+"在表演魔术");
	}
//b)提供空参,带参构造方法
	public ActedTreasurer() {
		super();
	}
	public ActedTreasurer(String id, String name, int salary) {
		super(id, name, salary);
	}
}
