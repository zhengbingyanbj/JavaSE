package level02_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/*
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���ʹ�õ����������յĽ�����������̨��
 * */
public class Test07 {
	public static void main(String[] args) {
		// 1.����HashSet���ڱ��������
		HashSet<Integer> hs = new HashSet<>();
		
		// 2.����Random���ڲ��������
		Random ran = new Random();
		
		// 3.ʹ��whileѭ���ж�hs��size�Ƿ�С��10
		while (hs.size() < 10) {
			// 4.hs��sizeС��10������һ�������
			int num = ran.nextInt(20) + 1;
			
			// 5.���������ӵ�HashSet,�ظ��������HashSet�������
			hs.add(num);
		}
		
		// 6.��ȡ������
		Iterator<Integer> itr = hs.iterator();
		
		// 7.ʹ�õ�����ѭ���ж��Ƿ�����һ��Ԫ��
		while (itr.hasNext()) {
			// 8.��ȡ����һ��Ԫ��.��ӡ����
			System.out.println(itr.next());
		}
	}
}