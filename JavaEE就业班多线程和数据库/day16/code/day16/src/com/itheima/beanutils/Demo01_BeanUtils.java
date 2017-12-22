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
		 * 设置属性值
		 * 参数 
		 * 	  Object obj:给哪个对象的属性赋值 需要对象支持
		 * 	  String name:给对象的哪个属性赋值  属性名
		 * 	  Object value:要赋的值
		 */
//		User u = new User();
		Class c =Class.forName("com.itheima.bean.User");
		Object obj = c.newInstance();
		BeanUtils.setProperty(obj, "username", "tangyan");
//		System.out.println(obj);
		
		/*
		 * getProperty(Object obj,String name)	获得属性值
		 * 参数 
		 * 	  Object obj:要获取哪个对象的属性值  需要对象支持
		 * 	  String name:要获取哪个属性值   属性名
		 */
		
		String username = BeanUtils.getProperty(obj, "username");
//		System.out.println(username);
		/*
		 * populate(Object bean, Map<String,String[]> properties)  
		 * 将Map集合中的数据 封装到javaBean对象中
		 * String key:属性名
		 * String[] value: 属性值
		 */
		Map<String,String[]> map = new HashMap<String, String[]>();
		map.put("id", new String[]{"38250"});
		map.put("username", new String[]{"liuyan"});
		map.put("password", new String[]{"123"});
		map.put("hobbies", new String[]{"抽烟","喝酒","烫头"});
		User u = new User();
		
		BeanUtils.populate(u, map);
		System.out.println(u);
		
	}
}
