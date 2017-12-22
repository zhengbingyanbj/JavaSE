package com.itheima.level1_06;
/*
 2.定义智能接口(Smart)
	a)抽象方法: 自动泊车(automaticParking)和无人驾驶(automaticDrive)
 */
public interface Smart {
//	 自动泊车(automaticParking)
	public abstract void automaticParking();
//	无人驾驶(automaticDrive)
	public abstract void automaticDrive();
}
