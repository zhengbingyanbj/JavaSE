package level02_01;

import java.util.HashMap;
import java.util.Scanner;

/*
 * ʹ�ü���¼��5��ѧ����Ϣ,¼���ʽΪ:������,���䡱.����5��ѧ����Ϣ����Map������,key������,value������
 */
public class Test01 {
	public static void main(String[] args) {
		// 1.����HashMap
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 2.��������¼�����
		Scanner sc = new Scanner(System.in);
		
		// 3.ѭ���ж�ֻҪHashMap�����Ƿ�С��5
		while (hm.size() < 5) {
			// 4.HashMap����С��5�������û���������
			System.out.println("����������������,��ʽΪ:����,����");
			String line = sc.nextLine();
			
			// 5.ʹ��,�ָ��û�������ַ���
			String[] strings = line.split(",");
			
			// 6.���ָ�������Ϊ0���ַ�����Ϊkey,����Ϊ1���ַ�����Ϊvalue,����HashMap��
			hm.put(strings[0], Integer.valueOf(strings[1]));
		}
		
		// 7.���HashMap�е�����
		System.out.println(hm);
	}
}