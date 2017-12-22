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
	
	//权限检查
	private void check(){
		System.out.println("权限检查......");
	}
	//写日志
	private void log(){
		System.out.println("写日志......");
	}

}
