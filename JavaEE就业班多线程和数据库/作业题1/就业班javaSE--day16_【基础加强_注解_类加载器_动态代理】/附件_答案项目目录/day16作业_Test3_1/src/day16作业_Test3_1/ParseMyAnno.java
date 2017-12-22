package day16作业_Test3_1;

import java.lang.reflect.Method;

import org.junit.Test;

public class ParseMyAnno {
	@Test
	public void parse() throws Exception{
		Class aClass = Class.forName("day16作业_Test3_1.BookDAO");
		Object obj = aClass.newInstance();
		Method[] methodArray = aClass.getMethods();
		
		for(Method m : methodArray){
			if(m.isAnnotationPresent(MyTest.class)){
				m.invoke(obj);
			}
		}
		
	}
}
