package day17��ҵ_Test3_1;

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
		System.out.println("������/s1����/s2��");
		String url = sc.next();
		
		//��ȡxml
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
			//��ȡ���е�<servlet>��Ԫ��
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
			System.out.println("û�ҵ���Ӧ����");
		}
	}
}
