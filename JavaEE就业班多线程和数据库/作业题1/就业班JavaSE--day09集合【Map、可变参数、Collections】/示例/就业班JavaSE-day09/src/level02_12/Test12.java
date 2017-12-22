package level02_12;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
	ʹ�ü���ѭ��¼��:����,�۸�.����һ��Map����,key�洢����,value�洢��ļ۸�. ¼������5��������:{Java=32.5,C++=25,PHP=28.6,UI=21.3,Python=10.2} Ҫ��;
		1.ɾ�������е�C++�Ȿ��
		2.Java���Ȿ���Ǽ�Ϊ38.5Ԫ 
		3.ʹ��keySet��entrySet���ֲ�ͬ��ʽ�Լ��ϱ������
 */
public class Test12 {
	public static void main(String[] args) throws IOException {
		// 1.����HashMap����key�������,value�������
		HashMap<String, Double> hm = new HashMap<>();
		
		// 2.��������¼�����Scanner
		Scanner sc = new Scanner(System.in);
		
		// 3.ѭ���ж�HashSet�������Ƿ�С��5
		while (hm.size() < 5) {
			// 4.���HashSet������С��5,���û�����һ�������Ϣ
			System.out.println("��¼��һ����(����,�۸�):");
			String line = sc.nextLine();
			
			// 5.ʹ��,�ָ������ͼ۸�
			String[] strings = line.split(",");
			
			// 6.�������ͼ۸���ӵ�HashMap��
			hm.put(strings[0], Double.valueOf(strings[1]));
		}
		
		// 7.ʹ��remove����ɾ�������е�C++�Ȿ��
		hm.remove("C++");
		
		// 8.ʹ��put������Java���Ȿ���Ǽ�Ϊ38.5Ԫ 
		hm.put("Java", 38.5);
		
		// 9.ʹ��keySet����Map
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			Double value = hm.get(key);
			System.out.println(key + " -- " + value);
		}
		
		// 10.ʹ��entrySet����Map
		Set<Entry<String, Double>> entrySet = hm.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
	}

}