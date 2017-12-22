package com.itheima.level2_03;

/*
  1.自定义异常类NoLifeValueExption继承RuntimeException
	a)提供空参和有参构造
	b)在有参构造中,需要调用父类的有参构造,把异常信息传入
 */
public class NoLifeValueExption extends RuntimeException{
	public NoLifeValueExption() {
		super();
	}
	public NoLifeValueExption(String message) {
		super(message);
	}
}
