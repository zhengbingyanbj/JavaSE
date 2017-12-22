package day18作业_Test1_7;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class MyBeanUtils {
	public static Object populate1(Class beanClass, Map<String,String[]> properties) throws Exception{
		
		//1 使用反射创建实例
		Object bean = beanClass.newInstance();
		//3 封装数据
		BeanUtils.populate(bean, properties);
		
		return bean;
	}
	

}
