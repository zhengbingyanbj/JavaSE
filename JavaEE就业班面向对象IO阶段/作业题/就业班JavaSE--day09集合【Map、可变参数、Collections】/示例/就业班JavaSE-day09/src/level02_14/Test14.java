package level02_14;

import java.util.HashMap;

/*
	����һ���ַ������Ϻ����ǲ���,�Ϻ�����,�人���ǲ���,���ں���,�������ǲ���,���ݺ���,��������,
	Ҫ��ʹ�ó���ͳ�Ƴ������ǲ��͡��͡������ڸ��ַ����г��ֵĴ���
 */
public class Test14 {
	public static void main(String[] args) {
		// 1.���崫�ǲ��ͺ����ַ���
		String str = "�Ϻ����ǲ���,�Ϻ�����,�人���ǲ���,���ں���,�������ǲ���,���ݺ���,��������";
		
		// 2.����HashMap���洫�ǲ��ͺͺ���Ĵ���
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 3.ʹ��put���key"���ǲ���",value0.key"����",value0
		hm.put("���ǲ���", 0);
		hm.put("����", 0);
		
		// 4.ʹ��,�ָ��ַ���
		String[] strings = str.split(",");
		
		// 5.ʹ����ǿfor������ȡÿ���ָ�������ַ���
		for (String name : strings) {
			// 6.����ָ����ַ���������"���ǲ���",��HashSet��"���ǲ���"��value+1
			if (name.contains("���ǲ���")) {
				Integer count = hm.get("���ǲ���");
				hm.put("���ǲ���", count + 1);
			} else if (name.contains("����")) {
				// 7.����ָ����ַ���������"����",��HashSet��"����"��value+1
				Integer count = hm.get("����");
				hm.put("����", count + 1);
			}
		}

		// 8.��ӡHashMap������
		System.out.println(hm);
	}

}