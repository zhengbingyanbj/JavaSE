package day18��ҵ_Test1_4;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class MainApp {
	public static void main(String[] args) throws Exception {
		Phone p = new Phone("ƻ��","������",78999,5.5);
		
		System.out.println("Ʒ�ƣ�" + BeanUtils.getProperty(p, "brand"));
		System.out.println("��ɫ��" + BeanUtils.getProperty(p, "color"));
		System.out.println("�۸�" + BeanUtils.getProperty(p, "price"));
		System.out.println("��Ļ�ߴ磺" + BeanUtils.getProperty(p, "size"));
	}
}
