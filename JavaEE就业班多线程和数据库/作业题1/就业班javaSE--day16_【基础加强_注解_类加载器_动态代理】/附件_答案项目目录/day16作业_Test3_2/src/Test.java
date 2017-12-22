import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) throws Exception {
		IBookDAO book = (IBookDAO)Proxy.newProxyInstance(BookDAO.class.getClassLoader(), BookDAO.class.getInterfaces(), new MyHandler(new BookDAO()));
		book.add();
	}
}
