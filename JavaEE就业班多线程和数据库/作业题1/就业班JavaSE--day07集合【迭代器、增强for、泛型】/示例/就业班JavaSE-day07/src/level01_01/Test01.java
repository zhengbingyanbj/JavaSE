package level01_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ��ϰCollection��add,remove,clear,size����
 */
public class Test01 {

	public static void main(String[] args) {
		// 1.����Colection����.Collection�ǽӿ�.���Դ�������ArrayList����
		Collection<String> coll = new ArrayList<String>();
		
		// 2.����������Ӷ���Ԫ��
		coll.add("itcast1");
		coll.add("itcast2");
		coll.add("itcast3");	
		
		// 3.ɾ��Ԫ��
		coll.remove("itcast2");		
		
		// 4.��ȡ���ϴ�С
		System.out.println(coll.size());
		
		// 5.��ռ���
		coll.clear();
		
		// 6.�����������
		System.out.println(coll);
	}

}
