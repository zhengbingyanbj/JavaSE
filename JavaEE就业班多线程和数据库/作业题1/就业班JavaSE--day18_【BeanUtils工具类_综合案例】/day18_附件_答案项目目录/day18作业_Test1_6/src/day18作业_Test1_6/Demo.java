package day18��ҵ_Test1_6;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;


public class Demo {
	@Test
	public void demo01(){
		Map<String,String[]> map = new HashMap<>();
		map.put("loginName", new String[] {"zhangsan"});
		map.put("loginPwd", new String[] {"888888"});
		map.put("sex", new String[] {"��"});
		map.put("education", new String[] {"����"});
		map.put("hobby", new String[] {"����","����","��Ӿ"});
		
		User user = new User();
		MyBeanUtils.populate0(user, map);
		
		System.out.println(user);
	}
}
