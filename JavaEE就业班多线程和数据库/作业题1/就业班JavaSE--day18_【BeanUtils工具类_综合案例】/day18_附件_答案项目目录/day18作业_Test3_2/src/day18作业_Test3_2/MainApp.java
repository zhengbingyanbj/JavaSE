package day18作业_Test3_2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MainApp {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		//1.列出菜单
		while(true){
			System.out.println("【查询学员】");
			System.out.println("1.按学科   2.按性别   3.按年龄   4.按分数    5.退出");
			int op = sc.nextInt();
			switch(op){
				case 1:
					List<Student> stuList = findByCourse();
					print(stuList);
					break;
				case 2:
					List<Student> list2 = findBySex();
					print(list2);
					break;
				case 3:
					List<Student> list3 = findByAge();
					print(list3);
					break;
				case 4:
					List<Student> list4 = findByScore();
					print(list4);
					break;
				case 5:
					System.out.println("谢谢使用！");
					System.exit(0);
				default:
					break;
			}
		}
	}

	private static List<Student> findByScore() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入分数范围，例如：80.5-90：");
		String ageArea = sc.next();
		String[] ageArray = ageArea.split("-");
		double minScore = Double.valueOf(ageArray[0]);
		double maxScore = Double.valueOf(ageArray[1]);
		List<Student> resultList = new ArrayList<>();
		//读取xml
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("student.xml"));
		Element root = dom.getRootElement();
		List<Element> courseEleList = root.elements("course");
		for(Element e : courseEleList){
			List<Element> stuEleList = e.elements("student");
			for(Element stuEle : stuEleList){
				Double score = Double.valueOf(stuEle.elementText("score"));
				if(score >= minScore && score <= maxScore){
					Student stu = new Student();
					BeanUtils.setProperty(stu, "id", stuEle.attributeValue("id"));
					List<Element> eList = stuEle.elements();
					for(Element ee : eList){
						BeanUtils.setProperty(stu, ee.getName(), ee.getText());
					}
					BeanUtils.setProperty(stu, "course", e.attributeValue("name"));
					resultList.add(stu);
				}
			}
		}
		return resultList;
	}

	private static List<Student> findByAge() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄范围，例如：20-25：");
		String ageArea = sc.next();
		String[] ageArray = ageArea.split("-");
		int minAge = Integer.valueOf(ageArray[0]);
		int maxAge = Integer.valueOf(ageArray[1]);
		List<Student> resultList = new ArrayList<>();
		//读取xml
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("student.xml"));
		Element root = dom.getRootElement();
		List<Element> courseEleList = root.elements("course");
		for(Element e : courseEleList){
			List<Element> stuEleList = e.elements("student");
			for(Element stuEle : stuEleList){
				int age = Integer.valueOf(stuEle.elementText("age"));
				if(age >= minAge && age <= maxAge){
					Student stu = new Student();
					BeanUtils.setProperty(stu, "id", stuEle.attributeValue("id"));
					List<Element> eList = stuEle.elements();
					for(Element ee : eList){
						BeanUtils.setProperty(stu, ee.getName(), ee.getText());
					}
					BeanUtils.setProperty(stu, "course", e.attributeValue("name"));
					resultList.add(stu);
				}
			}
		}
		return resultList;
	}

	private static List<Student> findBySex() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.男      2.女");
		int op = sc.nextInt();
		String sex = "";
		if(op == 1){
			sex = "男";
		}else{
			sex = "女";
		}
		List<Student> resultList = new ArrayList<>();
		//读取xml
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("student.xml"));
		Element root = dom.getRootElement();
		List<Element> courseEleList = root.elements("course");
		for(Element e : courseEleList){
			List<Element> stuEleList = e.elements("student");
			for(Element stuEle : stuEleList){
				if(sex.equals(stuEle.elementText("sex"))){
					Student stu = new Student();
					BeanUtils.setProperty(stu, "id", stuEle.attributeValue("id"));
					List<Element> eList = stuEle.elements();
					for(Element ee : eList){
						BeanUtils.setProperty(stu, ee.getName(), ee.getText());
					}
					BeanUtils.setProperty(stu, "course", e.attributeValue("name"));
					resultList.add(stu);
				}
			}
		}
		return resultList;
	}

	private static void print(List<Student> stuList) {
		for(Student stu : stuList){
			System.out.println(stu);
		}
	}

	private static List<Student> findByCourse() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("【请选择科目】");
		//读取所有学科信息：
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("student.xml"));
		Element root = dom.getRootElement();
		List<Element> courseList = root.elements("course");
		for(int i = 1; i <= courseList.size() ; i++){
			//列出菜单
			System.out.print(i + "." + courseList.get(i-1).attributeValue("name") + "   ");
		}
		System.out.println();
		//2.接收输入
		int op = sc.nextInt();
		List<Student> stuList = new ArrayList<>();
		for(int i = 0;i < courseList.size() ; i++){
			if(op-1 == i){
				List<Element> stuEleList = courseList.get(i).elements("student");
				for(Element e : stuEleList){
					Student stu = new Student();
					BeanUtils.setProperty(stu, "id", e.attributeValue("id"));
					//获取所有的子元素
					List<Element> sList = e.elements();
					for(Element ee : sList){
						BeanUtils.setProperty(stu, ee.getName(), ee.getText());
					}
					BeanUtils.setProperty(stu, courseList.get(i).getName(), courseList.get(i).attributeValue("name"));
					stuList.add(stu);
				}
				return stuList;
			}
		}
		return null;
	}
}
