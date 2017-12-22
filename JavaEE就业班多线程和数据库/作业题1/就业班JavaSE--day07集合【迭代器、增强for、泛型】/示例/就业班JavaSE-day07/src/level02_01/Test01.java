package level02_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * �Զ���ѧ����:��������,����,�ɼ�����.˽�г�Ա����,�����޲�,�вι��췽��,����get/set����.
 * ����5��ѧ���ŵ�ArrayList��.ʹ�õ�������ȡÿ��ѧ����Ϣ.ͳ���ܷ�,ƽ����,��߷�,��ͷֲ����
 */
public class Test01 {

	public static void main(String[] args) {
		// 2.����ArrayList
		ArrayList<Student> students = new ArrayList<>();
		
		// 3.���5��ѧ��
		students.add(new Student("����", 20, 99));
		students.add(new Student("���Ѿ�", 21, 88));
		students.add(new Student("��ʩ", 20, 80));
		students.add(new Student("����", 20, 70));
		students.add(new Student("���", 22, 30));
		
		// 4.��ȡ������
		Iterator<Student> itr = students.iterator();
		
		// 5.�����ܷ�
		double totalScore = 0;
		// 6.������߷�
		double maxScore = students.get(0).getScore();
		// 7.������ͷ�
		double minScore = students.get(0).getScore();
		
		// 8.ѭ���ж��Ƿ�����һ��ѧ��
		while (itr.hasNext()) {
			// 9.ʹ��next������ȡѧ������
			Student student = itr.next();
			
			// 10.�����ѧ������ķ�����ӵ��ܷ�
			totalScore += student.getScore();
			
			// 11.�ж����ѧ���ķ����Ƿ����������
			if (maxScore < student.getScore()) {
				// 12.���ѧ���ķ�������������.�������������ѧ���ķ���      
				maxScore = student.getScore();
			} else if (minScore > student.getScore()) {
				// 13.�ж����ѧ���ķ����Ƿ���������
				// 14.���ѧ���ķ���С����С����.��С�����������ѧ���ķ���
				minScore = student.getScore();
			}
		}
		
		// 15.����ƽ����(ƽ���� = �ܷ�/����)
		double avgScore = totalScore / students.size();
		// 16.��ӡ�ܷ�,��߷�,��ͷ�
		System.out.println("�ܷ� = " + totalScore + " ,ƽ���� = " + avgScore + " ,��߷� = " + maxScore + ",��� = " + minScore);
	}

}
