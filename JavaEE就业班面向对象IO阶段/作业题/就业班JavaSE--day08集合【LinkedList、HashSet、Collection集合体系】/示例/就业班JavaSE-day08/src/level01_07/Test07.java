package level01_07;

import java.util.HashSet;

/*
 * ��������,������������������.����4���˴洢��HashSet��.������������ͬ���˿���ͬһ�˲��洢
 */
public class Test07 {
	public static void main(String[] args) {
		// 2.����HashSet���ڴ洢Person����
		HashSet<Person> hashSet = new HashSet<Person>();

		// 3.��Ӷ��Person��HashSet��
		hashSet.add(new Person("���Ѿ�", 21));
		hashSet.add(new Person("��ʩ", 21));
		hashSet.add(new Person("����", 20));
		hashSet.add(new Person("����", 19));
		hashSet.add(new Person("����", 20));
		hashSet.add(new Person("����", 19));

		// 4.������ȡHashSet�е�����
		for (Person p : hashSet) {
			System.out.println(p);
		}
	}
}