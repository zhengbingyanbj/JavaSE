package level01_09;

/*
 * 自定义一个泛型接口Inter <E>,包含show(E e)抽象方法. 
 * 	使用1.定义实现类时确定泛型的类型, 
 * 		2.定义实现类时不确定泛型的类型2种方式定义实现类.并使用实现类
 */
public class Test09 {

	public static void main(String[] args) {
		// 7.在测试类中创建Imple01对象
		Imple01 i1 = new Imple01();
		// 8.调用Imple01类的show方法传入String参数
		i1.show("Hello");
		
		// 9.在测试类中创建Imple02对象,并确定泛型为Integer类型
		Imple02<Integer> i2 = new Imple02<>();
		// 10.调用Imple02类的show方法传入Integer参数
		i2.show(1234);
	}
}
