package level01_09;

// 5.定义Imple02类.实现Inter接口,定义实现类时不确定泛型的类型
public class Imple02<E> implements Inter<E> {

	// 6.重写Imple02类中的show(E e)方法.打印传入的内容
	@Override
	public void show(E e) {
		System.out.println(e);
	}

}
