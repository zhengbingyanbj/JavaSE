package cn.itcast04.myexception;
/*
 * 自定义运行期异常
 */
public class MyRuntimeException extends RuntimeException{
   
	public MyRuntimeException() {
		super();
	}
	
	public MyRuntimeException(String message) {
		super(message);
	}
}
