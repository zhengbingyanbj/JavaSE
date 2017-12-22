package cn.itcast.interface01;
/*
 * 
 *   类实现 接口      实现的这种动作 类似于 继承
 *       
 *        其他类(实现类)实现接口后，就相当于声明：”我应该具备这个接口中的功能”
 *        那么你就要 重写 所有方法
 *        
 *        实现的格式
 *        
 *        class 类 implements 接口名{
 *           重写所有方法
 *        }
 */
public class DeMaXiYa implements JiNeng{

	@Override
	public void Q() {
		System.out.println("沉默");
	}

	@Override
	public void W() {
		System.out.println("护盾");
	}

	@Override
	public void E() {
		System.out.println("旋转");
	}

	@Override
	public void R() {
		System.out.println("大宝剑  正义必胜");
	}

}
