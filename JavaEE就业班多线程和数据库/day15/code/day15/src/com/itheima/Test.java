package com.itheima;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*
 * ʹ��DOM4j����beans.xml
 * 
 * ����API���£�
 * 1.SAXReader����
 *		a)	read(��) ����ִ��xml�ĵ� ������document����
 * 2.Document����
 * 		a)	getRootElement() ��ø�Ԫ��
 * 3.Element����
 * 		a)	elements(��) ���ָ�����Ƶ�������Ԫ�ء����Բ�ָ������
 *		b)	element(��) ���ָ�����Ƶ�һ����Ԫ�ء����Բ�ָ������
 * 		c)	getName() ��õ�ǰԪ�ص�Ԫ����
 * 		d)	attributeValue(��) ���ָ��������������ֵ
 * 		e)	elementText(��) ���ָ��������Ԫ�ص��ı�ֵ
 * 		f)	getText() ��õ�ǰԪ�ص��ı�����
 * 
 */
public class Test {

	public static void main(String[] args) throws Exception {
		//����SAXReader����
		SAXReader sr = new SAXReader();
		//����xml�ļ�
		Document doc = sr.read("beans.xml");
//		System.out.println(doc);
		//��ȡ��Ԫ��  beans
		Element root = doc.getRootElement();
//		System.out.println(root.getName());
		//��ȡ���е�beanԪ��  ��Ԫ�ص���Ԫ��
		List<Element> beanList = root.elements("bean");
		//�������� ���λ�ȡ��ÿ��beanԪ��
		for(Element bean:beanList){
//			System.out.println(bean.getName());
			//��ȡbeanԪ�ص����� id className
			String id = bean.attributeValue("id");
			String className = bean.attributeValue("className");
			System.out.println(id+".."+className);
			
			//��ȡ����propertyԪ��
			List<Element> propertyList = bean.elements();
			//�������� ���λ�ȡ��ÿ��propertyԪ��
			for(Element property:propertyList){
//				System.out.println(property.getName());
//				��ȡpropertyԪ�ص� name value����
				String name = property.attributeValue("name");
				String value = property.attributeValue("value");
				System.out.println(name+".."+value);
			}
		}
		
	}
}









