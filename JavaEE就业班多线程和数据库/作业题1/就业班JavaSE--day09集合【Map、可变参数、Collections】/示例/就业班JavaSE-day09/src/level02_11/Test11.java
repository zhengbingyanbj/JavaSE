package level02_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
	��һ��Map��������洢��ѧ��������,����,��������:{����=21, ����=17, ����=21},
		1�������Ԫ��ʹ�����ֱ�����ʽ��ӡ�Ŀ���̨,
		2�����ĵ������Ϊ18,
		3��Ԫ�ش��뵽student.txt��.һ�б����ʽ:����,����
 */
public class Test11 {
	public static void main(String[] args) throws IOException {
		// 1.����HashMap����key�������,value�������
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 2.ʹ��put��Ӷ�Ӧ������
		hm.put("����", 21);
		hm.put("����", 17);
		hm.put("����", 21);
		
		// 3.ʹ��keySet����Map
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			Integer value = hm.get(key);
			System.out.println(key + " -- " + value);
		}
		
		// 4.ʹ��entrySet����Map
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		// 5.ʹ��put�޸����ĵ�����Ϊ18��
		hm.put("����", 18);
		
		// 6.����BufferedWriter�ַ������
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		
		// 7.ʹ��keySet����Map
		Set<String> keySet2 = hm.keySet();
		for (String key : keySet2) {
			// 8.����key�õ���Ӧ��value
			Integer value = hm.get(key);
			// 9.ʹ���ַ��������ƴ�Ӻõ��ַ���д���ļ���
			bw.write(key + " -- " + value);
			bw.newLine();
		}
		
		// 10.�ر���
		bw.close();
	}

}