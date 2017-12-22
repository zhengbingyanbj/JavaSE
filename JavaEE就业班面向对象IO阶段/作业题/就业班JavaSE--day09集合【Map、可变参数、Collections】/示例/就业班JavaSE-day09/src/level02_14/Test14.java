package level02_14;

import java.util.HashMap;

/*
	现有一串字符串”上海传智播客,上海黑马,武汉传智播客,深圳黑马,北京传智播客,广州黑马,北京黑马”,
	要求使用程序统计出”传智播客”和”黑马”在该字符串中出现的次数
 */
public class Test14 {
	public static void main(String[] args) {
		// 1.定义传智播客黑马字符串
		String str = "上海传智播客,上海黑马,武汉传智播客,深圳黑马,北京传智播客,广州黑马,北京黑马";
		
		// 2.创建HashMap保存传智播客和黑马的次数
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 3.使用put添加key"传智播客",value0.key"黑马",value0
		hm.put("传智播客", 0);
		hm.put("黑马", 0);
		
		// 4.使用,分割字符串
		String[] strings = str.split(",");
		
		// 5.使用增强for遍历获取每个分割出来的字符串
		for (String name : strings) {
			// 6.如果分割后的字符串串包含"传智播客",让HashSet中"传智播客"的value+1
			if (name.contains("传智播客")) {
				Integer count = hm.get("传智播客");
				hm.put("传智播客", count + 1);
			} else if (name.contains("黑马")) {
				// 7.如果分割后的字符串串包含"黑马",让HashSet中"黑马"的value+1
				Integer count = hm.get("黑马");
				hm.put("黑马", count + 1);
			}
		}

		// 8.打印HashMap的内容
		System.out.println(hm);
	}

}