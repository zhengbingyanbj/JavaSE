package com.itheima.level2_02;

/*
	c2)定义FrontToothPainExcption(门牙疼)继承ToothPainException(牙痛)
		i.提供空参和有参构造,注意有参构造必须调用父类的有参构造
 */
public class FrontToothPainExcption extends ToothPainException {

	public FrontToothPainExcption() {
		super();
	}

	public FrontToothPainExcption(String message) {
		super(message);
	}
}
