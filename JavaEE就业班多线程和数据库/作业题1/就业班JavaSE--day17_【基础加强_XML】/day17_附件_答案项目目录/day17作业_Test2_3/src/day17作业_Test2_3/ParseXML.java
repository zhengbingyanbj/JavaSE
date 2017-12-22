package day17��ҵ_Test2_3;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/*
 * 1.��ѯ������id���ڵ���2������ͼ����Ϣ������ӡ��
 * 2.��ѯ�����������а���Java������ͼ����Ϣ������ӡ��
 * 3.��ѯ�����м۸����50Ԫ������ͼ����Ϣ������ӡ��
 */
public class ParseXML {
	
	//1.��ѯ������id���ڵ���2������ͼ����Ϣ������ӡ��
	public void find1() throws Exception{
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("book.xml"));
		Element root = dom.getRootElement();
		List<Element> bookEleArray = root.elements("book");
		for(Element e : bookEleArray){
			String id = e.attributeValue("id");
			if(Integer.valueOf(id) >= 2){
				System.out.println(id + "\t" + 
									e.elementText("title") + "\t" + 
									e.elementText("publishDate") + "\t" + 
									e.elementText("price"));
			}
		}
	}
	//2.��ѯ�����������а���Java������ͼ����Ϣ������ӡ��
	public void find2() throws Exception{
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("book.xml"));
		Element root = dom.getRootElement();
		List<Element> bookEleArray = root.elements("book");
		for(Element e : bookEleArray){
			String bookName = e.elementText("title");
			if(bookName.contains("Java")){
				System.out.println(e.attributeValue("id") + "\t" + 
						e.elementText("title") + "\t" + 
						e.elementText("publishDate") + "\t" + 
						e.elementText("price"));
			}
		}
	}
	@Test
	//3.��ѯ�����м۸����50Ԫ������ͼ����Ϣ������ӡ��
	public void find3() throws Exception{
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("book.xml"));
		Element root = dom.getRootElement();
		List<Element> bookEleArray = root.elements("book");
		for(Element e : bookEleArray){
			String price = e.elementText("price");
			if(Double.parseDouble(price) > 50){
				System.out.println(e.attributeValue("id") + "\t" + 
						e.elementText("title") + "\t" + 
						e.elementText("publishDate") + "\t" + 
						e.elementText("price"));
			}
		}
	}
}	
