package com.itheima.level2_02;

/*
1.构建异常体系
	a)定义PainExecption(疼异常)类继承Exception
		i.提供空参和有参构造,注意有参构造必须调用父类的有参构造
 */
public class PainExecption extends Exception {
	public PainExecption() {
		super();
	}
	public PainExecption(String message) {
		super(message);
	}
}
