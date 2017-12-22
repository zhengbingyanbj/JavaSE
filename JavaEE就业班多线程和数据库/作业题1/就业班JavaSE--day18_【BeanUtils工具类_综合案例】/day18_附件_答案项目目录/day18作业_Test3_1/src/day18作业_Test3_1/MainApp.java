package day18��ҵ_Test3_1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MainApp {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//1.�г��˵�
		while(true){
			System.out.println("����ѯ�ֻ�����");
			System.out.println("1.��ɫ    2.��ɫ    3.��ɫ     4.��ɫ       5.�˳���");
			int op = sc.nextInt();
			switch(op){
				case 1:
					List<Phone> list = findByColor("��ɫ");
					printAll(list);
					break;
				case 2:
					list = findByColor("��ɫ");
					printAll(list);
					break;
				case 3:
					list = findByColor("��ɫ");
					printAll(list);
					break;
				case 4:
					list = findByColor("��ɫ");
					printAll(list);
					break;
				default:
					System.out.println("ллʹ�ã�");
					System.exit(0);
			}
		}
	}
	
	public static List<Phone> findByColor(String color) throws Exception{
		ArrayList<Phone> phoneList = new ArrayList<>();
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("phone.xml"));
		Element root = dom.getRootElement();
		List<Element> eleList = root.elements("product");
		for(Element e : eleList){
			if(color.equals(e.elementText("color"))){
				Phone p = new Phone();
				List<Element> eList = e.elements();
				for(Element ee : eList){
					BeanUtils.setProperty(p, ee.getName(), ee.getText());
				}
				phoneList.add(p);
			}
			
		}
		return phoneList;
	}
	
	public static void printAll(List<Phone> phoneList){
		for(Phone p : phoneList){
			System.out.println(p);
		}
	}
}
