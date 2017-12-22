package level01_08;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ÿλѧ�������������䣩�����Լ��ļ�ͥסַ����ô����Ȼ�ж�Ӧ��ϵ����ѧ������ͼ�ͥסַ�洢��map�����С�
 * ѧ����Ϊ��, ��ͥסַ��Ϊֵ, ��ʹ��keySet��entrySet��ʽ����Map����.ע�⣬ѧ��������ͬ����������ͬ��Ϊͬһ��ѧ��
 */
public class Test08 {
	public static void main(String[] args) {
		// 2.����HashMapkey����ѧ������,value��ѧ����ͥסַ
		HashMap<Student, String> hm = new HashMap<>();

		// 3.���һ��ѧ����HashMap��
		Student p1 = new Student("����", 46);
		Student p2 = new Student("����", 42);
		Student p3 = new Student("��÷", 22);
		Student p4 = new Student("������", 18);
		Student p5 = new Student("������", 18);

		hm.put(p1, "����");
		hm.put(p2, "����");
		hm.put(p3, "����");
		hm.put(p4, "����");
		hm.put(p5, "����");

		// 4.ʹ��keySet��ʽ����Map
		Set<Student> keySet = hm.keySet();
		for (Student p : keySet) {
			// ����key��ȡvalue
			String value = hm.get(p);
			System.out.println(p.getName() + "," + p.getAge() + " - " + value);
		}

		System.out.println("-------------");

		// 5.ʹ��entrySet��ʽ����Map
		Set<Entry<Student, String>> entrySet = hm.entrySet();
		for (Entry<Student, String> entry : entrySet) {
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.getName() + "," + key.getAge() + " - " + value);
		}
	}
}