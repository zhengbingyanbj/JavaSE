package cn.itcast04.myexception;
/*
 * �Զ����������쳣
 */
public class MyRuntimeException extends RuntimeException{
   
	public MyRuntimeException() {
		super();
	}
	
	public MyRuntimeException(String message) {
		super(message);
	}
}
