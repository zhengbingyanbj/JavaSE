package day16��ҵ_Test1_8;

import java.lang.reflect.Method;

public class ParseAnno {
	public static void main(String[] args) throws Exception {
		Class aClass = Class.forName("day16��ҵ_Test1_8.Student");
		Object obj = aClass.newInstance();
		Method[] methodArr = aClass.getMethods();
		for(Method m : methodArr){
			if(m.isAnnotationPresent(MyTest.class)){
				m.invoke(obj);
			}
		}
	}
}
