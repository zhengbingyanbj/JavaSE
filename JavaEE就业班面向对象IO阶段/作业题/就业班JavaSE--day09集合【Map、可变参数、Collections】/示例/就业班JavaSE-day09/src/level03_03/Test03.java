package level03_03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
	��֪Map�б���������Ϣ:{����ʱ�ꡱ=���ν���, �������롱=��¬���塱, ���Ƕ��ǡ�=�����á�},
	���м���ʾˮ�����������,value��ʾ���������.
		1��Map����� ����������=������ʤ��, ������ͷ��=���ֳ塱��λ�ú�.
		2ɾ���������롱=��¬���塱,
		3��keyΪ���Ƕ��ǡ���value�޸�Ϊnull,
		4.������ʱ�ꡱ=���ν���,�޸�Ϊ�������塱=�� �ν���
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		// 1.����HashMap<String, String>key�����,value������
		HashMap<String, String> heroMap = new HashMap<String, String>();
		
		// 2.ʹ��put�������Ĭ�ϵ�������ź�����
		heroMap.put("��ʱ��", "�ν�");
		heroMap.put("������", "¬����");
		heroMap.put("�Ƕ���", "����");
		
		// 3.ʹ��put������Map����� ����������=������ʤ��, ������ͷ��=���ֳ塱��λ�ú�.
		heroMap.put("������", "����ʤ");
		heroMap.put("����ͷ", "�ֳ�");
		
		// 4.ʹ��remove����ɾ���������롱=��¬���塱
		heroMap.remove("������");
		
		// 5.ʹ��put������keyΪ���Ƕ��ǡ���value�޸�Ϊnull
		heroMap.put("�Ƕ���", null);
		
		// 6.ʹ��remove����ɾ������ʱ�ꡱ=���ν���
		heroMap.remove("��ʱ��");
		
		// 7.ʹ��put��ӡ������塱=���ν���
		heroMap.put("������", "�ν�");
		
		System.out.println(heroMap);
	}

}