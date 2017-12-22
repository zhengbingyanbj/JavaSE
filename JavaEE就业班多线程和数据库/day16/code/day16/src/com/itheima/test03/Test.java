package com.itheima.test03;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*
 * ����XML�ļ�  ���䴴������ Ϊ��Ա������ֵ
 * ����API���£�
 * 1.SAXReader����
 *		a)	read(��) ����ִ��xml�ĵ� ������document����
 * 2.Document����
 * 		a)	getRootElement() ��ø�Ԫ��
 * 3.Element����
 * 		a)	elements(��) ���ָ�����Ƶ�������Ԫ�ء����Բ�ָ������
 *		b)	element(��) ���ָ�����Ƶ�һ����Ԫ�ء�
 * 		c)	getName() ��õ�ǰԪ�ص�Ԫ����
 * 		d)	attributeValue(��) ���ָ��������������ֵ
 * 		e)	elementText(��) ���ָ��������Ԫ�ص��ı�ֵ
 * 		f)	getText() ��õ�ǰԪ�ص��ı�����
 */
public class Test {

	public static void main(String[] args) throws DocumentException, Exception {
		//����SAXReader����
		SAXReader sr = new SAXReader();
		Document doc = sr.read("bean.xml");
		//��ȡ��Ԫ��
		Element root = doc.getRootElement();
		//��ȡ��Ԫ�ص���Ԫ�� ����beanԪ��
		List<Element> beanList = root.elements("bean");
		//�������� ���λ�ȡÿ��beanԪ��
		for(Element bean : beanList){
//			System.out.println(bean.getName());
			//��ȡbeanԪ�ص�����  className
			String className = bean.attributeValue("className");
//			System.out.println(className);
			//���䴴������
			Class c = Class.forName(className);
			Object obj = c.newInstance();
//			System.out.println(obj);
			//��ȡbeanԪ���µ���Ԫ��  ���е�PropertyԪ��
			List<Element> propertyList = bean.elements("property");
			//����
			for (Element property : propertyList) {
//				System.out.println(property.getName());
				//��ȡpropertyԪ�ص����� name���� value����
				String name = property.attributeValue("name");
				String value = property.attributeValue("value");
//				System.out.println(name+".."+value);
				//Ϊ��Ա������ֵ
				BeanUtils.setProperty(obj, name, value);
			}
			
			System.out.println(obj);
		}
		
		
	}
}













