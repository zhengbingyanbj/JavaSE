package level03_01;

import java.util.HashSet;
import java.util.Random;

/*
 * ˫ɫ�����:˫ɫ��ÿעͶע������6����ɫ������1����ɫ�������ɡ�
 * ��ɫ������1��33��ѡ����ɫ������1��16��ѡ��.���������һע˫ɫ�����
 * */
public class Test01 {
	public static void main(String[] args) {
		// 1.����Random���������
		Random ran = new Random();
		
		// 2.����HashSet���ڱ��治�ظ��ĺ���
		HashSet<Integer> hs = new HashSet<>();
		
		// 3.ѭ���жϺ��������Ƿ�С��6��
		while (hs.size() < 6) {
			// 4.������С��6���Ͳ���һ������.��ӵ�HashSet��
			int num = ran.nextInt(33) + 1;
			hs.add(num);
		}
		
		// 5.������һ������
		int blueBall = ran.nextInt(16) + 1;
		
		// 6.��ӡ�н�����
		System.out.println("˫ɫ���н�����:");
		System.out.print("������: ");
		
		for (Integer redBall : hs) {
			System.out.print(redBall + " ");
		}
		
		System.out.println();
		System.out.println("������: " + blueBall);
	}
	
}