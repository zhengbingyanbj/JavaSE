package level02_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * �Զ�������:��������,����,�������.˽�г�Ա����,�����޲�,�вι��췽��,����get/set����.
 * ����5���˷ŵ�ArrayList��.ʹ�õ�������ȡÿ���˵���Ϣ.�ҳ���ߵ���,����˲��������˺���˵���Ϣ.
 * ��ӡ��ʽ����:��ߵ���������,���1.80. �����������,���1.60
 */
public class Test02 {

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
		
		// 5.���������
		Person maxHeightPerson = persons.get(0);
		// 6.�������
		Person minHeightPerson = persons.get(0);
		
		// 7.ѭ���ж��Ƿ�����һ����
		while (itr.hasNext()) {
			// 8.ʹ��next������ȡѧ������
			Person student = itr.next();
			
			// 9.�ж�����˵ĵ�����Ƿ�������߶�
			if (maxHeightPerson.getHeight() < student.getHeight()) {
				// 10.����˵ĵ���ߴ������߶�.�����ߵ��˵��������
				maxHeightPerson = student;
			} else if (minHeightPerson.getHeight() > student.getHeight()) {
				// 11.�ж�����˵ĵ�����Ƿ�С������߶�
				// 12.����˵ĵ����С������߶�.���ߵ��˵��������
				minHeightPerson = student;
			}
		}
		
		// 13.���ո�ʽ��ӡ��Ϣ
		System.out.println("��ߵ�����" + maxHeightPerson.getName() + ",��� " + 
					maxHeightPerson.getHeight() + ". �������" + minHeightPerson.getName() 
					+ ",��� " + minHeightPerson.getHeight());
	}

}
