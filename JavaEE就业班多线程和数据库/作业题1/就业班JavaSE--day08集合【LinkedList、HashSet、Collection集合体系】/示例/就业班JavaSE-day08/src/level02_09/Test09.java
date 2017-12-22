package level02_09;

import java.util.HashSet;
import java.util.Scanner;

/*
 * ��дһ�����򣬼���¼��������,ֱ��¼��-1����.��¼����ظ�����ȥ��,������Щ���ظ����ݵ��ܺͺ�ƽ��ֵ
 * */
public class Test09 {
	public static void main(String[] args) {
		// 1.����Scanner����,���ڼ���¼��
		Scanner sc = new Scanner(System.in);
		
		// 2.����HashSet.����ȥ���ظ�������
		HashSet<Integer> hs = new HashSet<>();
		
		// 3.��ͣѭ��,���û���������
		while (true) {
			System.out.println("������һ������");
			
			// 4.����Scanner��nextInt()����,���û�����һ������
			int num = sc.nextInt();
			
			// 5.����û�����-1,����ѭ��
			if (num == -1) {
				break;
			}
			
			// 6.����-1��������ӵ�HashSet
			hs.add(num);
		}
		
		System.out.println(hs);
		
		// 7.������ͱ���sum
		int sum = 0;
		
		// 8.ʹ����ǿfor��ȡHashSet�е�ÿ��Ԫ��
		for (Integer i : hs) {
			// 9.��ÿ��������ӵ�sum��
			sum += i;
		}
		
		// 10.�����͵Ľ��
		System.out.println("������: " + sum);
		
		// 11.���ƽ��ֵ,ƽ��ֵ = ���� / ����
		System.out.println("ƽ��ֵ��: " + sum / hs.size());
	}
}