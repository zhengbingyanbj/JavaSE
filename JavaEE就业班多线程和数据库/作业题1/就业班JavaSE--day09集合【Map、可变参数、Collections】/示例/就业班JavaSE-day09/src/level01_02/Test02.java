package level01_02;

import java.util.HashMap;

/*
 * ��ϰMap���ϵĳ��÷���: put, get, remove
 */
public class Test02 {
	public static void main(String[] args) {
		// 1.����HashMap
		HashMap<String, String> hm = new HashMap<String, String>();

		// 2.ʹ��put���Ԫ��
		hm.put("������", "Baby");
		hm.put("�˳�", "��ٳ");
		hm.put("�", "������");
		hm.put("���ţ", "������");
		
		// 3.ʹ��put�޸�Ԫ��
		String v1 = hm.put("�", "�װٺ�");

		// 4.ʹ��get��ȡԪ��
		String string = hm.get("���ţ");

		// 5.ʹ��removeɾ��Ԫ��
		String v2 = hm.remove("���ţ");
		System.out.println(v2);
		
		// 6.��ӡ�����е�Ԫ��
		System.out.println(hm);
	}
}