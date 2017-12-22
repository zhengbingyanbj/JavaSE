import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{
	private Object target;
	public MyHandler(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.check();
		Object result = method.invoke(target, args);
		this.log();
		
		return result;
	}
	
	//Ȩ�޼��
	private void check(){
		System.out.println("Ȩ�޼��......");
	}
	//д��־
	private void log(){
		System.out.println("д��־......");
	}

}
