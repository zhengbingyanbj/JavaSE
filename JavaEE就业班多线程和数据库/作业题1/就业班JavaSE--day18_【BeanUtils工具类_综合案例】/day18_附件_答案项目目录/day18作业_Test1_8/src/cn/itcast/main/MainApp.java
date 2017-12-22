package cn.itcast.main;

import java.io.File;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import cn.itcast.domain.Book;
import cn.itcast.domain.Car;

public class MainApp {
	public static void main(String[] args) throws Exception {
		//1.创建两个对象
		Book book = new Book();
		Car car = new Car();
		
		//2.读取xml
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("beans.xml"));
		Element root = dom.getRootElement();
		//获取所有的<bean>子元素
		List<Element> beanList = root.elements("bean");
		for(Element e : beanList){
			String className = e.attributeValue("className");
			Class c = Class.forName(className);
			Object o = c.newInstance();
			List<Element> eleList = e.elements("property");
			for(Element ee : eleList){
				String name = ee.attributeValue("name");
				String value = ee.attributeValue("value");
				BeanUtils.setProperty(o, name, value);
			}
			System.out.println(o);
		}
		
	}
}
