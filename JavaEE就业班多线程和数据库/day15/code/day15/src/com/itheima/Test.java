package com.itheima;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*
 * 使用DOM4j解析beans.xml
 * 
 * 常用API如下：
 * 1.SAXReader对象
 *		a)	read(…) 加载执行xml文档 并返回document对象
 * 2.Document对象
 * 		a)	getRootElement() 获得根元素
 * 3.Element对象
 * 		a)	elements(…) 获得指定名称的所有子元素。可以不指定名称
 *		b)	element(…) 获得指定名称第一个子元素。可以不指定名称
 * 		c)	getName() 获得当前元素的元素名
 * 		d)	attributeValue(…) 获得指定属性名的属性值
 * 		e)	elementText(…) 获得指定名称子元素的文本值
 * 		f)	getText() 获得当前元素的文本内容
 * 
 */
public class Test {

	public static void main(String[] args) throws Exception {
		//创建SAXReader对象
		SAXReader sr = new SAXReader();
		//加载xml文件
		Document doc = sr.read("beans.xml");
//		System.out.println(doc);
		//获取根元素  beans
		Element root = doc.getRootElement();
//		System.out.println(root.getName());
		//获取所有的bean元素  根元素的子元素
		List<Element> beanList = root.elements("bean");
		//遍历集合 依次获取到每个bean元素
		for(Element bean:beanList){
//			System.out.println(bean.getName());
			//获取bean元素的属性 id className
			String id = bean.attributeValue("id");
			String className = bean.attributeValue("className");
			System.out.println(id+".."+className);
			
			//获取所有property元素
			List<Element> propertyList = bean.elements();
			//遍历集合 依次获取到每个property元素
			for(Element property:propertyList){
//				System.out.println(property.getName());
//				获取property元素的 name value属性
				String name = property.attributeValue("name");
				String value = property.attributeValue("value");
				System.out.println(name+".."+value);
			}
		}
		
	}
}









