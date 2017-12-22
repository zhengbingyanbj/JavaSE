package com.itheima.test03;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*
 * 解析XML文件  反射创建对象 为成员变量赋值
 * 常用API如下：
 * 1.SAXReader对象
 *		a)	read(…) 加载执行xml文档 并返回document对象
 * 2.Document对象
 * 		a)	getRootElement() 获得根元素
 * 3.Element对象
 * 		a)	elements(…) 获得指定名称的所有子元素。可以不指定名称
 *		b)	element(…) 获得指定名称第一个子元素。
 * 		c)	getName() 获得当前元素的元素名
 * 		d)	attributeValue(…) 获得指定属性名的属性值
 * 		e)	elementText(…) 获得指定名称子元素的文本值
 * 		f)	getText() 获得当前元素的文本内容
 */
public class Test {

	public static void main(String[] args) throws DocumentException, Exception {
		//创建SAXReader对象
		SAXReader sr = new SAXReader();
		Document doc = sr.read("bean.xml");
		//获取根元素
		Element root = doc.getRootElement();
		//获取根元素的子元素 所有bean元素
		List<Element> beanList = root.elements("bean");
		//遍历集合 依次获取每个bean元素
		for(Element bean : beanList){
//			System.out.println(bean.getName());
			//获取bean元素的属性  className
			String className = bean.attributeValue("className");
//			System.out.println(className);
			//反射创建对象
			Class c = Class.forName(className);
			Object obj = c.newInstance();
//			System.out.println(obj);
			//获取bean元素下的子元素  所有的Property元素
			List<Element> propertyList = bean.elements("property");
			//遍历
			for (Element property : propertyList) {
//				System.out.println(property.getName());
				//获取property元素的属性 name属性 value属性
				String name = property.attributeValue("name");
				String value = property.attributeValue("value");
//				System.out.println(name+".."+value);
				//为成员变量赋值
				BeanUtils.setProperty(obj, name, value);
			}
			
			System.out.println(obj);
		}
		
		
	}
}













