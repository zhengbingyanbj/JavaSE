 package cn.itcast05.exceptiontest;

public class Person {

	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) throws UnAgeException {
		super();
		if(age<0 || age>200){
			//抛出一个  年龄非法的异常
			throw new UnAgeException("这是妖精吗，年龄非法的");
		}
		
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	
}
