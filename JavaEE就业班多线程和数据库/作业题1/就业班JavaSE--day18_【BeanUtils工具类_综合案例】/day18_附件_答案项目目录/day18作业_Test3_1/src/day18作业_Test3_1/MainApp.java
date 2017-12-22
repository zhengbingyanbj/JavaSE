package day18作业_Test3_1;

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
		//1.列出菜单
		while(true){
			System.out.println("【查询手机：】");
			System.out.println("1.黑色    2.白色    3.银色     4.金色       5.退出：");
			int op = sc.nextInt();
			switch(op){
				case 1:
					List<Phone> list = findByColor("黑色");
					printAll(list);
					break;
				case 2:
					list = findByColor("白色");
					printAll(list);
					break;
				case 3:
					list = findByColor("银色");
					printAll(list);
					break;
				case 4:
					list = findByColor("金色");
					printAll(list);
					break;
				default:
					System.out.println("谢谢使用！");
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
