package day18��ҵ_Test1_5;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class MainApp {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Map<String,String[]> map = new HashMap<>();
		map.put("loginName", new String[] {"zhangsan"});
		map.put("loginPwd", new String[] {"888888"});
		map.put("sex", new String[] {"��"});
		map.put("education", new String[] {"����"});
		map.put("hobby", new String[] {"����","����","��Ӿ"});
		
		User user = new User();
		BeanUtils.populate(user, map);
		
		System.out.println(user);
		
		
	}
}
