package level02_02;

import java.util.HashSet;

/*
 * ��HashSet�����������{����,����,����,��Ѿ,Ǯ��,����},����Ѿɾ��,�����СѾ
 */
public class Test02 {
	public static void main(String[] args) {
		// 1.����HashSet����
		HashSet<String> hs = new HashSet<String>();
		
		// 2.ʹ��add������HashSet�����Ԫ��
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("��Ѿ");
		hs.add("Ǯ��");
		hs.add("����");

		// 3.ʹ��remove����ɾ��HashSet�еĶ�Ѿ
		hs.remove("��Ѿ");
		
		// 4.ʹ��add������HashSet�������СѾ
		hs.add("��СѾ");
		System.out.println(hs);
	}
}