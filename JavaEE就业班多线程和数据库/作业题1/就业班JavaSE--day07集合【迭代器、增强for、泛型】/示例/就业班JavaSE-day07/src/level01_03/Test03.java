package level01_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ��ArrayList�������Ԫ�ء�abc1��, ��abc2��, ��abc3��, ��abc4��.ʹ�õ�������ȡArrayList�����е�Ԫ��
 */
public class Test03 {

	public static void main(String[] args) {
		// 1.�������϶���
		Collection<String> coll = new ArrayList<String>();
		// 2.�������д��Ԫ��
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");

		// 3.��ȡ�����ĵ�����
		Iterator<String> it = coll.iterator();

		// 4.ʹ�õ������ж��Ƿ�����һ��Ԫ��
		while(it.hasNext()){
			// 5.ʹ�õ����������ȡ�����е�Ԫ��
			System.out.println(it.next());
		}
	}

}
