package day18��ҵ_Test1_7;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class MyBeanUtils {
	public static Object populate1(Class beanClass, Map<String,String[]> properties) throws Exception{
		
		//1 ʹ�÷��䴴��ʵ��
		Object bean = beanClass.newInstance();
		//3 ��װ����
		BeanUtils.populate(bean, properties);
		
		return bean;
	}
	

}
