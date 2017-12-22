package level01_06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ��ArrayList�������Ԫ�ء� abc��, �� itcast��,��ϰArrayList���ӷ��ͺͼӷ���2�����������ArrayList�е�Ԫ��.
 * ��˵�����͵ĺô�
 * 
 * ʹ�õ������ĺô�:
 * 	������ȷ�����ŵ�Ԫ�����ͣ���ô��ʹ�õ�������ʱ�򣬵�����Ҳͬ����֪���������Ԫ������,������Ͳ�һ�¾ͻ���뱨��,����������ǿת���鷳.
 */
public class Test06 {

	public static void main(String[] args) {
//		method01();
		method02();
	}

	private static void method02() {
		// 1.�����з��͵�ArrayList
		Collection<String> list = new ArrayList<String>();
		// 2.����ַ���
		list.add("abc");
		list.add("itcast");
		// 3.���Integer����
		// list.add(5); // ��������ȷ���ͺ󣬴�����Ͳ�һ�¾ͻ���뱨��
		// 4.��ȡ������
		Iterator<String> it = list.iterator();
		// 5.�ж��Ƿ�����һ��Ԫ��
		while (it.hasNext()) {
			// 6.��ȡ��һ��Ԫ��,Ԫ����String����
			String str = it.next();
			
			// 7.��ȡ�ַ����ĳ���
			System.out.println(str.length());
		}
	}

	private static void method01() {
		// 1.����û�з��͵�ArrayList
		Collection list = new ArrayList<String>();
		// 2.����ַ���
		list.add("abc");
		list.add("itcast");
		// 3.���Integer����
		list.add(5); // û�з���,�������Ͷ��ܷ���
		
		// 4.��ȡ������
		Iterator it = list.iterator();
		
		// 5.�ж��Ƿ�����һ��Ԫ��
		while (it.hasNext()) {
			// 6.��ȡ��һ��Ԫ��,��ǿתΪString����
			String str = (String)it.next();
			
			// 7.��ȡ�ַ����ĳ���
			System.out.println(str.length());
		}
	}

}
