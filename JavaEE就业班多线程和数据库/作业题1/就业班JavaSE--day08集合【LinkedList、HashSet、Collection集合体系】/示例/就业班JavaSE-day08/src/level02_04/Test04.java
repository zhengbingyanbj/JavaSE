package level02_04;

import java.util.HashSet;
import java.util.Iterator;

/*
 * ����һ��Student��,��������,����,�Ա�(����,����,�Ա���ȫ��ͬ��Ϊͬһѧ��)
����10��Student����,����������ѧ������,����,�Ա���ȫ��ͬ. ����10��ѧ����ӵ�Set������,�������ظ�,����Set���ϴ�ӡѧ����Ϣ,ʹ�����ַ�ʽ
 */
public class Test04 {
	public static void main(String[] args) {
		// 2.����HashSet����
		HashSet<Student> set = new HashSet<>();
		// 3.ʹ��Student�ഴ��10��ѧ��,����10��ѧ����ӵ�Set������
        set.add(new Student("����", 18, "��"));
        set.add(new Student("С��", 16, "Ů"));
        set.add(new Student("ٻٻ", 19, "Ů"));
        set.add(new Student("��ΰ", 18, "��"));
        set.add(new Student("����", 18, "��"));
        set.add(new Student("����", 38, "��"));
        set.add(new Student("����", 18, "��"));
        set.add(new Student("С��", 20, "Ů"));
        set.add(new Student("����", 18, "��"));
        set.add(new Student("���", 21, "��"));

        // 4.ʹ�õ���������HashSet
        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        
        System.out.println("------------------------------------------------");
        // 5.ʹ����ǿfor��������
        for(Student stu : set){
        	System.out.println(stu);
        }
	}
}