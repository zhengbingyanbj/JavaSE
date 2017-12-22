import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{
	private Object target;
	public MyHandler(Object target){
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.before();
		Object result = method.invoke(this.target, args);
		this.after();
		return result;
	}
	
	private void before(){
		System.out.println("��Ŀ���......");
	}
	private void after(){
		System.out.println("��Ŀ�ܽ�......");
	}

}
