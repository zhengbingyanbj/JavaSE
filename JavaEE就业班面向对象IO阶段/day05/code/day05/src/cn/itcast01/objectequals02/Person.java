package cn.itcast01.objectequals02;

public class Person {

	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
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
//    /*
//     * 重写方法 完成  比较 Person两个对象 成员变量是否相等
//     */
//	@Override
//	public boolean equals(Object obj) {//Object obj = p2
//		//指向同一个空间
//		if(this==obj){
//			return true;
//		}
//		//传递的这对象 空间没有 
//		if(obj==null){
//			return false;
//		}
//		
//		//this 属性  obj中属性 
//		//需要向下转型  先要做判断 
//		if(obj instanceof Person){
//			Person other = (Person)obj;
//			//this   other
//			if(this.age==other.age && this.name.equals(other.name)){
//				return true;
//			}
//		}
//		
//		return false;
//		
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
