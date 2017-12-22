package com.itheima.test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test03_02 {
	/*
	 * ��d��Ŀ¼����һ�������ļ�a.txt���ļ���ֻ��Ӣ�ĺ����֣��������ǡ�heima��
		������������ȷʱ���ܶ�ȡ�ļ�������ݡ���Ҫ���ô�����ģ���ȡ�ļ��Ĺ��̣���ͳ���ļ��������ĸ���ֵĴ�����
		����ͳ�ƽ���������¸�ʽ�����d�̵�count.txt�С�
		a��2��
		b��3��
		c��4��
		............
	 */
	public static void main(String[] args) throws IOException {
		// ���������������
		Scanner sc = new Scanner(System.in);
		// ����������
		System.out.println("���������룺");
		// �ж������Ƿ���ȷ
		while(true){
			String password = sc.nextLine();
			if(password.equals("heima")) {
				break;
			} else {
				System.out.println("����������������룺");
			}
		}
		// ����map���ϴ������
		Map<Character,Integer> map = new HashMap<>();
		// ͳ��ÿ���ַ����ֵĴ���
		calCuteCharCount(map);
		// ��ͳ�ƽ�����浽�ļ���
		saveResult(map);
	}
	
	/*
	 * ��ͳ�ƽ�����浽�ļ���
	 */
	public static void saveResult(Map<Character,Integer> map) throws IOException {
		// �����ַ����������
		BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt",true));
		// ����map����
		for(Entry<Character,Integer> entry:map.entrySet()) {
			// a��2��
			bw.write(entry.getKey()+":" + entry.getValue()+"��");
			// д���з�
			bw.newLine();
		}
		// �ر���
		bw.close();
	}
	/*
	 * ͳ��ÿ���ַ����ֵĴ���
	 */
	public static void calCuteCharCount(Map<Character,Integer> map) throws IOException {
		// �������������Ч��
		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
		String line = null;
		// ѭ����ȡ����
		while((line = br.readLine()) != null) {
			// �����ַ���
			for (int index = 0; index < line.length(); index++) {
				// ���ÿһ���ַ�
				Character ch = line.charAt(index);
				// �ж�map�����Ƿ��и��ַ���Ӧ�ļ�
				if(map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}
		// �ر���
		br.close();
	}
}
