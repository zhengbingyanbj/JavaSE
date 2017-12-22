package level01_07;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ÿλѧ�������������䣩�����Լ��ļ�ͥסַ����ô����Ȼ�ж�Ӧ��ϵ����ѧ������ͼ�ͥסַ�洢��Map�����С�
 * ��ͥסַ��Ϊ��, ѧ����Ϊֵ����ʹ��keySet��entrySet��ʽ����Map����
 */
public class Test07 {
	public static void main(String[] args) {
		// 2.����HashMapkey����ѧ����ͥסַ,value��ѧ������
		HashMap<String, Student> hm = new HashMap<String, Student>();

		// 3.���һ��ѧ����HashMap��
		Student p1 = new Student("����", 46);
		Student p2 = new Student("����", 42);
		Student p3 = new Student("��÷", 22);
		Student p4 = new Student("������", 18);

		hm.put("����", p1);
		hm.put("����", p2);
		hm.put("����", p3);
		hm.put("����", p4);

		// 4.ʹ��keySet��ʽ����Map
		for (String key : hm.keySet()) {
			// 5.ͨ��key��ȡvalue
			Student p = hm.get(key);
			System.out.println(key + " -  " + p.getName() + "," + p.getAge());
		}

		System.out.println("----------------------");
		// 6.ʹ��entrySet��ʽ����Map
		Set<Entry<String, Student>> entrySet = hm.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			Student p = entry.getValue();
			System.out.println(entry.getKey() + " - " + p.getName() + "," + p.getAge());
		}

	}
}