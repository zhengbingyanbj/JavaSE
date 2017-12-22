package level03_04;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/*
	������ˮ��(ƻ�����㽶�����ϣ�����)
	 1����ÿ��ˮ���趨һ����Ʒ�ţ���Ʒ����8��0-9�����������Ʒ���벻���ظ�, ��Сֵ "00000001", ���ֵ "99999999"
	 2��������Ʒ�Ų�ѯ��Ӧ����Ʒ��
	����鲻������������޴���Ʒ��
	����ܲ鵽��ӡ����������Ʒ�ţ�12345678����ѯ����Ӧ����ƷΪ�����ϡ�
 */
public class Test04 {
	public static void main(String[] args) throws IOException {
		// 1.��������ˮ������
		String[] fruit = { "ƻ��", "�㽶", "����", "����" };

		// 2.�������������
		Random ran = new Random();

		// 3.����HashSet����4������ͬ����Ʒ��
		HashSet<String> ids = new HashSet<>();
		
		// 4.ѭ���ж�HashSet�Ƿ�С��4.
		while (ids.size() < 4) {
			// 5.����һ����Ʒ���,��8��0-9����
			String id = "";
			for (int i = 0; i < 8; i++) {
				id += ran.nextInt(10);
			}

			// 6.��ӵ�HashSet��
			ids.add(id);
		}

		// 7.����HashMap,�����Ʒid����Ʒ����
		HashMap<String, String> hm = new HashMap<>();

		// 8.����ids,�õ�ÿ����Ʒid,��ȥ��һ����Ӧ����Ʒ����,�洢��HashMap��
		int index = 0;
		for (String id : ids) {
			// �ҵ�һ����Ӧ����Ʒ
			String product = fruit[index];
			hm.put(id, product);

			index++;
		}

		System.out.println(hm);

		// 9.���û�����Ҫ��ѯ����Ʒid
		System.out.println("������Ҫ��ѯ��Ʒ��id:");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();

		// 10.����idȥmap�в��Ҷ�Ӧ����Ʒ
		String product = hm.get(id);
		if (product == null) {
			// 11.û���ҵ���Ʒ��ӡ:���޴���Ʒ
			System.out.println("���޴���Ʒ");
		} else {
			// 12.�ҵ���Ʒ��ӡ��Ӧ��Ʒ����Ϣ
			System.out.println("������Ʒ�ţ�" + id + "����ѯ����Ӧ����ƷΪ��" + product);
		}
	}

}