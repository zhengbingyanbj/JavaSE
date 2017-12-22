package com.itheima.level2_02;

/* 
3.定义用于测试的子类Son,继承Father
	a)验证: 重写方法不能抛出与父类平级的其他异常
		i.重写父类的eat方法,抛出与牙疼平级舌头疼异常,编译报错,说明这句话是对的
		ii.注释掉这个重写的方法,验证下一个
	b)验证: 重写方法不能抛出比父类高级的异常
		i.重写父类的eat方法,抛出比牙疼高级疼异常,编译报错,说明这句话是对的
	c)验证:重写方法: 可以抛出和父类同样的异常
		i.重写父类的eat方法,也抛出牙疼异常,编译通过,说明这句话是对的
	d)验证:重写方法: 可以抛出父类抛出异常的子类异常.
		i.重写父类的eat方法,抛出牙疼异常的子类异常大牙疼异常,编译通过,说明这句话是对的
	e)验证: 重写方法: 可以抛出多个 "父类抛出异常的子类异常".
		i.重写父类的eat方法,抛出牙疼异常的两个子类异常,大牙疼和门牙疼,编译通过,说明这句是对的
	f)验证:父类不抛出异常,子类也不能抛出异常(编译时异常)
		i.重写父类的drink方法,抛出(牙疼,舌头疼,门牙疼)任意一个编译异常,编译都报错,说明这句话是对的
	g)验证: 如果子类内部抛出了异常(或调用抛出异常的方法)只能自己处理,不允许向外抛.
		i.重写父类的drink方法
		ii.输出喝到了100度的水
		iii.抛出舌头疼异常
		iv.这个时候编译报错
		v.把上面两句代码放到try代码块中
		vi.在catch代码块中打印异常信息
		vii.编译通过.
 */
public class Son extends Father {
	// 1. 重写方法不能抛出与父类平级的其他异常
//	 public void eat() throws TonguePainException {
//	 }

//	   2. 重写方法不能抛出比父类高级的异常
//	public void eat() throws PainException {
//
//	}
//	// 3. 重写方法: 可以抛出和父类同样的异常
//	public void eat() throws ToothPainException {
//		
//	}
//	 4. 重写方法: 可以抛出父类抛出异常的子类异常.
//	public void eat() throws BigToothPainException {
//		
//	}
//	     5. 重写方法: 可以抛出多个 "父类抛出异常的子类异常".
//	public void eat() throws BigToothPainException,FrontToothPainExcption {
//	}

////	父类不抛出异常,子类也不能抛出异常(编译时异常)
//	public void drink() throws FrontToothPainExcption  {
//	}

//	如果子类有异常只能自己处理,不允许向外抛.
	public void drink() {
		try{
			System.out.println("到100度的热水了");
			throw new TonguePainException();
		} catch (TonguePainException ex) {
			System.out.println("在疼都要忍着不能说,因为你爸都不说,你也不能说");
		}
	}
}
