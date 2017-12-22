package level03_02;

import java.util.HashSet;
import java.util.Iterator;

/*
 * һ��ѧ���������ɰ༶��ÿһ���༶��������ѧ��������ѧ��һ���󼯺ϣ����ɸ��༶��Ϊÿһ��С����(����Ƕ��֮HashSetǶ��HashSet)��Ҫ������
	1�� ѧ�������������ԣ����������䣬�������вι��졢�޲ι����getter/setter����.������������ͬ����Ϊͬһѧ��
	2����༶������������ɸ�ѧ������������ѧ������
	2����ѧ�Ƽ�����������а༶(���ٴ��������༶)��
	3��ʹ�����ַ�������ѧ�Ƽ��ϣ�����ӡ������ѧ����
 * */
public class Test02 {
	public static void main(String[] args) {
		// 1.����HashSet��Ϊһ���༶���ϴ���ѧ��
		HashSet<Student> class1 = new HashSet<Student>();
		class1.add(new Student("zhangsan", 20));
		class1.add(new Student("lisi", 25));
		class1.add(new Student("lisi", 25));

		// ����HashSet��Ϊһ���༶���ϴ���ѧ��
		HashSet<Student> class2 = new HashSet<Student>();
		class2.add(new Student("wanwu", 23));
		class2.add(new Student("zhaoli", 27));

		// ����HashSet<HashSet<Student>>��Ϊһ��ѧ�Ƽ��ϴ���༶
		HashSet<HashSet<Student>> xueKe = new HashSet<HashSet<Student>>();
		xueKe.add(class1);
		xueKe.add(class2);

		System.out.println("--------------��ǿfor����----------------");
		// ʹ�����ַ�������ѧ�Ƽ��ϣ�����ӡ������ѧ����
		// ��ǿfor
		for (HashSet<Student> cls : xueKe) {
			for (Student student : cls) {
				System.out.println(student.getName() + "---" + student.getAge());
			}
		}

		System.out.println("--------------����������----------------");

		// ����������
		Iterator<HashSet<Student>> xueKeItr = xueKe.iterator();
		while (xueKeItr.hasNext()) {
			HashSet<Student> cls = xueKeItr.next();
			Iterator<Student> clsItr = cls.iterator();
			
			while (clsItr.hasNext()) {
				Student stu = clsItr.next();
				System.out.println(stu.getName() + "---" + stu.getAge());
			}
		}
	}

}