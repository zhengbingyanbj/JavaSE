package level01_09;

// 3.定义Imple01类.实现Inter接口,使用定义实现类时确定泛型的类型方式
public class Imple01 implements Inter<String> {
	// 4.重写Imple01中的show(String e)方法.打印传入的内容
	@Override
	public void show(String e) {
		System.out.println(e);
	}

}
