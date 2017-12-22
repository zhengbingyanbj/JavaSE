package com.itheima.level3_01;

/*
 请使用代码描述:    
所有飞机(Plane)都具有飞(fly)的功能，但是战斗机(Battleplane)除了具有飞的功能外，还具有发射炮弹(fire)的功能！
要求:
   1.在测试类中创建战斗机对象,调用fly和fire方法; 
   2.然后测试向上转型(转换为父类类型和实现的接口类型)和向下转型.


 1.定义飞机类Plane
	a)成员方法:fly()
	i.输出:飞机在飞
2.定义接口类Firing接口
	a)抽象方法:fire
3.定义战斗机类(Battleplane) 继承 Plane 实现 Firing接口
	a)实现抽象方法 fire
	i.输出:战斗机在发射炮弹
4.定义测试类(Test)
	a)创建战斗机(Battleplane)的对象 bp,调用飞和发射炮弹功能
	b)把bp赋值给 Plane p,
		i.尝试调用fly和fire方法
		ii.先判断p是否是Battleplane的实例对象,如果是把p向下转型为Battleplane,然后调用fire方法
	c)把bp赋值给 Fireing 类型 f 变量
		i.尝试使用使用f调用fly和fire方法
		ii.先判断f是否是Battleplane的实例对象,如果是把f向下转为为Battleplane,然后调用fly方法
 */

public class Test {
	public static void main(String[] args) {
//		a)创建战斗机(Battleplane)的对象 bp,调用飞和发射炮弹功能
		Battleplane bp = new Battleplane();
		bp.fly();
		bp.fire();
//		b)把bp赋值给 Plane p,
//			i.尝试调用fly和fire方法
		Plane p = bp;
		p.fly();
//		p.fire(); 编译报错,方法调用编译看左边的类型
//			ii.先判断p是否是Battleplane的实例对象,如果是把p向下转型为Battleplane,然后调用fire方法
		if(p instanceof Battleplane){
			Battleplane bpp = (Battleplane) p;
			bpp.fire();
		}
//		c)把bp赋值给 Fireing 类型 f 变量
		Firing f = bp;
//			i.尝试使用使用f调用fly和fire方法
		f.fire();
//			ii.先判断f是否是Battleplane的实例对象,如果是把f向下转为为Battleplane,然后调用fly方法
		if(f instanceof Battleplane){
			Battleplane pf = (Battleplane) f;
			pf.fly();
		}
	}
}
