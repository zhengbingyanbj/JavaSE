package day18作业_Test2_2;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MainApp {
	public static void main(String[] args) throws Exception {
		//1.创建两个ArrayList
		List<Product> tvList = new ArrayList<>();
		List<Product> rrtList = new ArrayList<>();
		//2.读取xml
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("product.xml"));
		Element root = dom.getRootElement();
		List<Element> ctgrList = root.elements("category");
		for(Element e : ctgrList){
			String category = e.attributeValue("name");
			List<Element> pdtList = e.elements("product");
			for(Element ee : pdtList){
				Product p = new Product();
				List<Element> fieldList = ee.elements();
				for(Element eee : fieldList){
					BeanUtils.setProperty(p, eee.getName(), eee.getText());
				}
				BeanUtils.setProperty(p, "id", ee.attributeValue("id"));
				BeanUtils.setProperty(p, "category", category);
				
				if("电视机".equals(category)){
					tvList.add(p);
				}
				if("电冰箱".equals(category)){
					rrtList.add(p);
				}
			}
		}
		//3.打印
		System.out.println(tvList);
		System.out.println(rrtList);
	}
}
