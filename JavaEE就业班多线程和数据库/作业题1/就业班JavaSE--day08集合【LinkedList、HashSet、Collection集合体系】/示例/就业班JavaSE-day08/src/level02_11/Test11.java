package level02_11;

import java.util.HashSet;
/*
 * �Զ���ѧ����:��������,����,�ɼ�����.˽�г�Ա����,�����޲�,�вι��췽��,����get/set����.
 * ����5��ѧ���ŵ�HashSet��(������������ͬ����Ϊ��ͬһѧ��).
 * ʹ�õ�������ȡÿ��ѧ����Ϣ.ͳ���ܷ�,ƽ����,��߷�,��ͷֲ����
 * */
public class Test11 {
	public static void main(String[] args) {
		// 1.����HashSet,���ڴ��ѧ��
		HashSet<Student> hs = new HashSet<>();
		
		// 2.ʹ��add�������5��ѧ��
		hs.add(new Student("���Ѿ�", 21, 99));
		hs.add(new Student("��ʩ", 21, 88));
		hs.add(new Student("����", 20, 77));
		hs.add(new Student("����", 19, 66));
		hs.add(new Student("����", 19, 89));
		hs.add(new Student("����", 18, 89));
		
		// 3.ʹ�õ�������ȡһ��ѧ��.
		Student student = hs.iterator().next();
		
		// 4.�����ֱܷ���
		double totalScore = 0;
		
		// 5.������߷ֱ���,��ʼ��ֵΪ����������ѧ���ĳɼ�
		double maxScore = student.getScore();
		
		// 6.������ͷֱ���,��ʼ��ֵΪ����������ѧ���ĳɼ�
		double minScore = student.getScore();
		
		// 7.ʹ����ǿforѭ����ȡ����HashSet,��ȡ��ÿ��ѧ��
		for (Student stu : hs) {
			// 8.����ǿfor�н�ѧ���ķ�����ӵ��ܷ�
			totalScore += stu.getScore();
			
			// 9.����ǿfor���ж���߷��Ƿ�С�����ѧ���ķ���,�����߷�С�����ѧ���ķ���,�����ѧ���ķ�������Ϊ��߷�
			if (maxScore < stu.getScore()) {
				maxScore = stu.getScore();
			} else if (minScore > stu.getScore()) {
				// 10.����ǿfor���ж���ͷ��Ƿ�������ѧ���ķ���,�����ͷִ������ѧ���ķ���,�����ѧ���ķ�������Ϊ��ͷ�
				minScore = stu.getScore();
			}
		}
		
		// 11.����ƽ����(ƽ���� = �ܷ� / ����)
		double avgScore = totalScore / hs.size();
		
		// 12.���ո�ʽ��ӡ
		System.out.println("�ܷ� = " + totalScore + ",ƽ���� = " + avgScore + ",��߷� = " + maxScore + ",��ͷ� = " + minScore);
	}
}