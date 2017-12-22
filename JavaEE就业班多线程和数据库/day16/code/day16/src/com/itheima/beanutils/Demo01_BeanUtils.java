package com.itheima.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.bean.User;

public class Demo01_BeanUtils {

	public static void main(String[] args) throws Exception, InvocationTargetException {
		/*
		 * setProperty(Object obj,String name,Object value)	
		 * ��������ֵ
		 * ���� 
		 * 	  Object obj:���ĸ���������Ը�ֵ ��Ҫ����֧��
		 * 	  String name:��������ĸ����Ը�ֵ  ������
		 * 	  Object value:Ҫ����ֵ
		 */
//		User u = new User();
		Class c =Class.forName("com.itheima.bean.User");
		Object obj = c.newInstance();
		BeanUtils.setProperty(obj, "username", "tangyan");
//		System.out.println(obj);
		
		/*
		 * getProperty(Object obj,String name)	�������ֵ
		 * ���� 
		 * 	  Object obj:Ҫ��ȡ�ĸ����������ֵ  ��Ҫ����֧��
		 * 	  String name:Ҫ��ȡ�ĸ�����ֵ   ������
		 */
		
		String username = BeanUtils.getProperty(obj, "username");
//		System.out.println(username);
		/*
		 * populate(Object bean, Map<String,String[]> properties)  
		 * ��Map�����е����� ��װ��javaBean������
		 * String key:������
		 * String[] value: ����ֵ
		 */
		Map<String,String[]> map = new HashMap<String, String[]>();
		map.put("id", new String[]{"38250"});
		map.put("username", new String[]{"liuyan"});
		map.put("password", new String[]{"123"});
		map.put("hobbies", new String[]{"����","�Ⱦ�","��ͷ"});
		User u = new User();
		
		BeanUtils.populate(u, map);
		System.out.println(u);
		
	}
}
