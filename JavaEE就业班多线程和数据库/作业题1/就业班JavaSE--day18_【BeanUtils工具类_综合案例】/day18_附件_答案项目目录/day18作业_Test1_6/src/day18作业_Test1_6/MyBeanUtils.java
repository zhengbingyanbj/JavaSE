package day18��ҵ_Test1_6;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class MyBeanUtils {
	public static void populate0(Object user, Map<String,String[]> properties){
		try {
			// ��װ����
			BeanUtils.populate(user, properties);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
