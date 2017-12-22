package com.itheima.level2_02;
/*
 b1)定义ToothPainException(牙疼异常)类继承PainException
	i.提供空参和有参构造,注意有参构造必须调用父类的有参构造
 */
public class ToothPainException extends PainExecption {

	public ToothPainException() {
		super();
	}
	public ToothPainException(String message) {
		super(message);
	}
}
