package level01_05;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ��ArrayList�������Ԫ�ء� itcast��, �� itcast2��, �� itcast3��, �� itcast4��ʹ����ǿfor����ArrayList�е�Ԫ��
 */
public class Test05 {

	public static void main(String[] args) {
		// 1.����ArrayList
		Collection<String> coll = new ArrayList<String>();
		
		// 2.��ArrayList�����Ԫ��
		coll.add("itcast1");
		coll.add("itcast2");
		coll.add("itcast3");
		coll.add("itcast4");
		
		// 3.ʹ����ǿforѭ����ȡԪ��
		for(String str : coll){ //����Str�����������ļ���Ԫ��
			System.out.println(str);
		}

	}

}
