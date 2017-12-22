package cn.itcast05.exceptiontest;

public class UnAgeException extends Exception{

	public UnAgeException() {
		super();
	}

	public UnAgeException(String message) {
		super(message);
	}
  
}
