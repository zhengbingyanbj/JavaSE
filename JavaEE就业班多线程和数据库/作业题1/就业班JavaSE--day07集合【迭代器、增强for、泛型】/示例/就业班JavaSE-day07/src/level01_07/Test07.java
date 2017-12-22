package level01_07;

/*
 * 自定义泛型类GenericClass<E>,包含E类型的成员变量,提供get/set方法,并使用这个泛型类
 */
public class Test07 {

	public static void main(String[] args) {
		// 4.创建泛型类对象.并指定具体类型
		GenericClass<Integer> g = new GenericClass<Integer>();
		// 5.调用set方法传入对应的类型
		g.setElement(100);
		
		// 6.调用get方法获取成员变量的值
		Integer i = g.getElement();
		System.out.println(i);
	}

}

// 1.自定义泛型类
class GenericClass<E> {

	// 2.定义E类型的成员变量
	private E element;

	// 3.添加get/set方法
	public void setElement(E element) {
		this.element = element;
	}

	public E getElement() {
		return element;
	}
}
