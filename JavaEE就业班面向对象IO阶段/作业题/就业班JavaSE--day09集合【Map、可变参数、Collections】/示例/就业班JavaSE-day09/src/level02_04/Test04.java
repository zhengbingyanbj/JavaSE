package level02_04;

import java.util.HashMap;
import java.util.Set;

/*
	�з�������5���ˣ���Ϣ���£�������-���ʣ�������=2100, ����=1700, �����=1800, ���ʦ̫=2600, ��������=3800��,
		������Ա���������Ϣ������ʺϵļ�����,�������ǹ���300,������ÿ��Ԫ�ص��������������̨
 */
public class Test04 {
	public static void main(String[] args) {
		// 1.����HashMap,������Ϊkey,������Ϊvalue
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		// 2.ʹ��put���������Ҫ��Ԫ��
		map.put("����", 2100);
		map.put("����", 1700);
		map.put("�����", 1800);
		map.put("���ʦ̫", 2600);
		map.put("��������", 3800);
		
		// 3.��ȡ�����ҵĹ���
		int salary = map.get("����");
		
		// 4.�޸����ҵĹ���Ϊ��ǰ���ʼ���300
		map.put("����", salary + 300);
		
		// 5.ʹ����ǿfor+keySet������ÿ��Ա���Ĺ���
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + " -- " + map.get(key));
		}
	}

}