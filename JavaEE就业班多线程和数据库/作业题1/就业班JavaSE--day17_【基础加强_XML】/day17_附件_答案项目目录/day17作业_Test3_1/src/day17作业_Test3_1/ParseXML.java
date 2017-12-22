package day17作业_Test3_1;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class ParseXML {
	@Test
	public void findClass() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入/s1或者/s2：");
		String url = sc.next();
		
		//读取xml
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("web.xml"));
		Element root = dom.getRootElement();
		List<Element> mapEleList = root.elements("servlet-mapping");
		
		String servletName = null;
		for(Element e : mapEleList){
			if(url.equals(e.elementText("url-pattern"))){
				servletName = e.elementText("servlet-name");
				break;
			}
		}
		String servletClass = null;
		if(servletName != null){
			//获取所有的<servlet>子元素
			List<Element> servletEleList = root.elements("servlet");
			for(Element e : servletEleList){
				if(servletName.equals(e.elementText("servlet-name"))){
					servletClass = e.elementText("servlet-class");
					break;
				}
			}
		}
		if(servletClass != null){
			System.out.println(servletClass);
		}else{
			System.out.println("没找到对应的类");
		}
	}
}
