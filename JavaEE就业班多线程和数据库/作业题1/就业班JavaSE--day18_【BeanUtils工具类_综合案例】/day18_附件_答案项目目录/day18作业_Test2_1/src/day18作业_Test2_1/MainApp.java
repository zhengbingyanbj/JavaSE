package day18作业_Test2_1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MainApp {
	public static void main(String[] args) throws Exception {
		//1.定义一个集合
		List<Student> stuList = new ArrayList<>();
		//2.解析XML
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("student.xml"));
		Element root = dom.getRootElement();
		List<Element> stuEleList = root.elements("student");
		for(Element e : stuEleList){
			Student stu = new Student();
			List<Element> eList = e.elements();
			for(Element ee : eList){
				BeanUtils.setProperty(stu, ee.getName(), ee.getText());
			}
			stu.setStuNo(e.attributeValue("stuNo"));
			stuList.add(stu);
		}
		//3.遍历集合
		for(Student stu : stuList){
			System.out.println(stu);
		}
	}
}
