package day18作业_Test1_3;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class MainApp {

	public static void main(String[] args) throws Exception {
		Cat c = new Cat();
		
		BeanUtils.setProperty(c, "name", "波斯猫");
		BeanUtils.setProperty(c, "age", 2);
		BeanUtils.setProperty(c, "color", "白色");
		BeanUtils.setProperty(c, "sex", '母');
		
		System.out.println(c.toString());
	}

}
