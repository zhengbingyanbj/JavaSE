package level03_02;

/*
 * 编写一个泛型方法求两个数之和.两个数可以传入int、long、float、double类型.
 *	提示:泛型不能使用基本数据类型,需要使用引用数据类型.Integer,Long,Float,Double都是Number的子类.
 *	Number有doubleValue()方法
 */
public class Test02 {

	// Number: 类上面 ctrl + t可以看到这个类的继承体系
	public static void main(String[] args) {
		double a = 10.5;
		double b = 2.5;
		// 3.调用sum方法,传入2个double值
		double sum = sum(a, b);
		System.out.println(sum);

		int c = 10;
		int d = 20;
		// 4.调用sum方法,传入2个int值
		System.out.println(sum(c, d));
		System.out.println(sum(10, 1.2));
	}

	// 1.定义泛型方法sum(T a, T b).向上限定<T extends Number>让参数传递的时候只能传递Number及其子类
	public static <T extends Number> double sum(T a, T b) {
		// 2.参数a和b是T类型不能直接进行相加
		// 3.将传递进来的a和b调用doubleValue方法获取到double类型的值,再进行加法运算
		return a.doubleValue() + b.doubleValue();
	}
}
