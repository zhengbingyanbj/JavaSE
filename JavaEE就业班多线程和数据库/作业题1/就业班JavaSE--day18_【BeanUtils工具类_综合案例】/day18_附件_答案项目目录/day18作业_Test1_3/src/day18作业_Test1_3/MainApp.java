package day18��ҵ_Test1_3;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class MainApp {

	public static void main(String[] args) throws Exception {
		Cat c = new Cat();
		
		BeanUtils.setProperty(c, "name", "��˹è");
		BeanUtils.setProperty(c, "age", 2);
		BeanUtils.setProperty(c, "color", "��ɫ");
		BeanUtils.setProperty(c, "sex", 'ĸ');
		
		System.out.println(c.toString());
	}

}
