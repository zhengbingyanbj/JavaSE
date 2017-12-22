package com.itheima.level3_01;
/*
 3.定义战斗机类(Battleplane) 继承 Plane 实现 Firing接口
	a)实现抽象方法 fire
	i.输出:战斗机在发射炮弹
 */
public class Battleplane extends Plane implements Firing{
//  发射
	public void fire() {
		System.out.println("战斗机在发射炮弹");
	}
}
