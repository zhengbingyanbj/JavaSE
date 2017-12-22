import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		Person p = (Person)Proxy.newProxyInstance(Student.class.getClassLoader(), Student.class.getInterfaces(), new MyHandler(new Student()));
		p.work();
	}

}
