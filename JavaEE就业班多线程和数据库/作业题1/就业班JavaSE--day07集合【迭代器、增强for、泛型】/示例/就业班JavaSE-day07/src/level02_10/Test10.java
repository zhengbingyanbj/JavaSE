package level02_10;

import java.util.ArrayList;

/*
 * ��дһ��deleteElements����������һ��ArrayList,ArrayList�д��Ԫ�ص����Ͳ�ȷ����
 * ��deleteElements������ɾ��ArrayList�еĵ�һ�������һ��Ԫ��
 */
public class Test10 {

	public static void main(String[] args) {
		// 4.����ArrayList
		ArrayList<String> array = new ArrayList<>();
		
		// 5.��ArrayList���Ԫ��
		array.add("���Ѿ�");
		array.add("��ʩ");
		array.add("����");
		array.add("����");
		
		// 6.����deleteElements��������array
		deleteElements(array);
		
		// 7.��ӡarray
		System.out.println(array);
	}

	// 1.����deleteElements(ArrayList<?> array)����
	public static void deleteElements(ArrayList<?> array) {
		// 2.��deleteElements������ɾ����һ��Ԫ��
		array.remove(0);
		
		// 3.ɾ�����һ��Ԫ��
		array.remove(array.size() - 1);
	}
}
