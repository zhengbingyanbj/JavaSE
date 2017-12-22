package day18作业_Test1_4;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class MainApp {
	public static void main(String[] args) throws Exception {
		Phone p = new Phone("苹果","土豪金",78999,5.5);
		
		System.out.println("品牌：" + BeanUtils.getProperty(p, "brand"));
		System.out.println("颜色：" + BeanUtils.getProperty(p, "color"));
		System.out.println("价格：" + BeanUtils.getProperty(p, "price"));
		System.out.println("屏幕尺寸：" + BeanUtils.getProperty(p, "size"));
	}
}
