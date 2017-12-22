package com.itheima.level2_02;
/*
		c1)定义BigToothPainException(大牙疼)继承ToothPainException(牙痛)
			i.提供空参和有参构造,注意有参构造必须调用父类的有参构造
 */
public class BigToothPainException extends ToothPainException {

	public BigToothPainException() {
		super();
	}

	public BigToothPainException(String message) {
		super(message);
	}
}
