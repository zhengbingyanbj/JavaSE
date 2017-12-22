package level02_08;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * �Զ�������:��������,����,�������.˽�г�Ա����,�����޲�,�вι��췽��,����get/set����.
 * ����5���˶���ŵ�ArrayList��.ʹ�õ�������ȡÿ���˶���.��ÿ���˵������2��.��ʹ����ǿfor��ӡÿ���˵���Ϣ
 */
public class Test08 {

	public static void main(String[] args) {
		// 2.����ArrayList
		ArrayList<Person> persons = new ArrayList<>();
		
		// 3.���5��ѧ��
		persons.add(new Person("����", 20, 1.66));
		persons.add(new Person("���Ѿ�", 21, 1.65));
		persons.add(new Person("��ʩ", 20, 1.70));
		persons.add(new Person("����", 20, 1.72));
		persons.add(new Person("���", 22, 1.80));
		
		// 4.��ȡ������
		Iterator<Person> itr = persons.iterator();
		
		// 5.ѭ���ж��Ƿ�����һ����
		while (itr.hasNext()) {
			// 6.ʹ��next������ȡѧ������
			Person p = itr.next();
			
			// 7.��ѧ���������2��,��ʹ��setAge�������û�ȥ
			p.setAge(p.getAge() + 2);
		}
		
		// 8.ʹ����ǿfor��ȡÿ��ѧ��,��ӡÿ��ѧ������Ϣ
		for (Person p : persons) {
			System.out.println(p.getName() + " ������� " + p.getAge());
		}
	}

}
