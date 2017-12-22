package com.itheima.level2_02;
/*
	b2)定义TonguePainException(舌头疼异常)类继承PainException
		i.提供空参和有参构造,注意有参构造必须调用父类的有参构造
 */
public class TonguePainException  extends PainExecption{
	public TonguePainException() {
		super();
	}
	public TonguePainException(String message) {
		super(message);
	}
}
