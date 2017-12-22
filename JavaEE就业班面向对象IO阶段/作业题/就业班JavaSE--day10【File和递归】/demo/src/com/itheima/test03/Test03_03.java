package com.itheima.test03;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test03_03 {

	public static void main(String[] args) {
		File dir = inputFile();
		// ����map����
		Map<String,Integer> map = new HashMap<String, Integer>();
		getFileType(dir,map);
		// ����map
		for(Entry<String,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + " ���͵��ļ��� " + entry.getValue() + " �� ");
		}
	}
	
	public static void getFileType(File f,Map<String,Integer> map) {
		if(f.isDirectory()) {
			File files[] = f.listFiles();
			for (File file : files) {
				getFileType(file,map);
			}
		} else {
			// ����ļ���
			String fileName = f.getName();
			// ����ļ���չ��
			String key = fileName.substring(fileName.lastIndexOf(".") + 1);
			// �ж�map�Ƿ����key
			if(map.containsKey(key)){
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
	}
	
	/*
	 * �����û������·���ַ��������ļ�����
	 */
	private static File inputFile() {
		// ���������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·����");
		// �����û������·��
		String filePath = sc.nextLine();
		// ����·���ַ��������ļ�����
		File dir = new File(filePath);
		if(!dir.exists()) throw new RuntimeException("��������ļ�·�������ڣ�����");
		// �ж��Ƿ����ļ���
		if(!dir.isDirectory()){
			throw new RuntimeException("�����·�������ļ���·��������");
		}
		return dir;
	}
}
