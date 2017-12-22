package level01_08;

/*
 * 自定义泛型方法function.可以传入任意类型数据t.在这个方法中打印传入的t.并使用这个泛型方法
 */
public class Test08 {

	public static void main(String[] args) {
		// 3.调用function传入字符串
		function("Hello");
		// 4.调用function传入数字
		function(123);
	}

	// 1.定义泛型方法
	public static <E> void function(E e) {
		// 2.在泛型方法中,将传入的参数放到输出语句中
		System.out.println(e);
	}
}
