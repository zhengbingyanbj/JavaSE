package level02_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/*
 *ArrayList����������Ԫ��:{"�Ű�֥","���»�","����","����ӱ","��ӱ","������","�Ű�֥","���»�"}.
 * 1.ʹ��HashSet���ظ���Ԫ��ȥ��.2.��дһ������:��ȥ�غ����Աд�뵽D:\\a.txt��.3.��дһ������:
 * ��D:\\a.txt���������ŵ���Ա��Ϣ��ȡ��������ӡ������̨��
 * */
public class Test06 {
	public static void main(String[] args) throws IOException {
		// 1.����ArrayList
		ArrayList<String> arr = new ArrayList<String>();
		
		// 2.ʹ��add������ArrayList���ָ��������
		arr.add("�Ű�֥");
		arr.add("���»�");
		arr.add("����");
		arr.add("����ӱ");
		arr.add("��ӱ");
		arr.add("������");
		arr.add("�Ű�֥");
		arr.add("���»�");
		
		// 3.����HashSet.��ArrayList�����ݷ���HashSetȥ���ظ�����
		HashSet<String> hs = new HashSet<>(arr);
		
		// 9.����save����,����ȥ�غ������
		save(hs);
		
		// 15.����read����
		read();
	}
	
	// 10.����read()������ȡָ���ļ�����
	public static void read() throws IOException {
		// 11.����BufferedReader�ַ�������
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		System.out.println("��ȡ�����ŵ�����:");
		
		String line = null;
		// 12.��ȡ�ļ��е�����
		while ((line = br.readLine()) != null) {
			// 13.�ж������Ƿ����ſ�ͷ
			if (line.startsWith("��")) {
				// 14.��ӡ���ſ�ͷ������
				System.out.println(line);
			}
		}
	}
	
	// 4.����save(HashSet<String> hs)����
	public static void save(HashSet<String> hs) throws IOException {
		// 5.��save�����д���BufferedWriter�ַ������
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		// 6.������ȡÿ������
		for (String name : hs) {
			// 7.������д��ָ���ļ���
			bw.write(name);
			bw.newLine();
		}
		
		// 8.�ر���
		bw.close();
	}
}