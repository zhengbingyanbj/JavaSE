package day18��ҵ_Test3_2;

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
		
		//1.�г��˵�
		while(true){
			System.out.println("����ѯѧԱ��");
			System.out.println("1.��ѧ��   2.���Ա�   3.������   4.������    5.�˳�");
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
					System.out.println("ллʹ�ã�");
					System.exit(0);
				default:
					break;
			}
		}
	}

	private static List<Student> findByScore() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������Χ�����磺80.5-90��");
		String ageArea = sc.next();
		String[] ageArray = ageArea.split("-");
		double minScore = Double.valueOf(ageArray[0]);
		double maxScore = Double.valueOf(ageArray[1]);
		List<Student> resultList = new ArrayList<>();
		//��ȡxml
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
		System.out.println("���������䷶Χ�����磺20-25��");
		String ageArea = sc.next();
		String[] ageArray = ageArea.split("-");
		int minAge = Integer.valueOf(ageArray[0]);
		int maxAge = Integer.valueOf(ageArray[1]);
		List<Student> resultList = new ArrayList<>();
		//��ȡxml
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
		System.out.println("1.��      2.Ů");
		int op = sc.nextInt();
		String sex = "";
		if(op == 1){
			sex = "��";
		}else{
			sex = "Ů";
		}
		List<Student> resultList = new ArrayList<>();
		//��ȡxml
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
		System.out.println("����ѡ���Ŀ��");
		//��ȡ����ѧ����Ϣ��
		SAXReader reader = new SAXReader();
		Document dom = reader.read(new File("student.xml"));
		Element root = dom.getRootElement();
		List<Element> courseList = root.elements("course");
		for(int i = 1; i <= courseList.size() ; i++){
			//�г��˵�
			System.out.print(i + "." + courseList.get(i-1).attributeValue("name") + "   ");
		}
		System.out.println();
		//2.��������
		int op = sc.nextInt();
		List<Student> stuList = new ArrayList<>();
		for(int i = 0;i < courseList.size() ; i++){
			if(op-1 == i){
				List<Element> stuEleList = courseList.get(i).elements("student");
				for(Element e : stuEleList){
					Student stu = new Student();
					BeanUtils.setProperty(stu, "id", e.attributeValue("id"));
					//��ȡ���е���Ԫ��
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
