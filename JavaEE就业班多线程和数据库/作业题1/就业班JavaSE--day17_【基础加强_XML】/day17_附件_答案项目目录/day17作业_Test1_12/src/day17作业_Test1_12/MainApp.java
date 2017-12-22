package day17ื๗าต_Test1_12;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MainApp {

	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("product.xml"));
		Element root = dom.getRootElement();
		List<Element> proEleList = root.elements("product");
		for(Element e : proEleList){
			String id = e.attributeValue("id");
			String name = e.elementText("name");
			String color = e.elementText("color");
			String price = e.elementText("price");
			
			System.out.println(id + "\t" + name + "\t" + color + "\t" + price);
		}
	}

}
