package day18作业_Test1_7;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Demo {
	@Test
	public void demo01() throws Exception{
		Map<String,String[]> map = new HashMap<>();
		map.put("title", new String[]{"JavaEE开发指南"});
		map.put("author", new String[]{"jack"});
		map.put("price", new String[]{"33"});
		map.put("publishDate", new String[]{"2017-01-20"});
	
		Book book = (Book)MyBeanUtils.populate1(Book.class, map);
		System.out.println(book);
		
	}
}
