package com.itheima.test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test03_01 {
	/*
	 * ģ���û���¼��ע�Ṧ��ʵ�֡�
	�����û�������û��������룬Ȼ��͵�ǰ��Ŀuser.txt�ļ��д洢���û���������ƥ�䡣
	����ļ��Ѿ������û�����������Ҳ����ȷ�ģ���ʾ��¼�ɹ���������ʾ��¼ʧ�ܡ�
	����ļ��в����ڸ��û�������ʹ�ø��û���������ע��һ���µ��˺ţ�����ʾע��ɹ���
	 */
	public static void main(String[] args) {
		// ���������������
		Scanner sc = new Scanner(System.in);
		// �������û���������
		System.out.println("�������û�����");
		String username = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();
		// ���õ�¼����
		login(username,password);
	}
	
	/*
	 *  ��¼�������ж��û����������Ƿ���ȷ����ȷ����true,���򷵻�false
	 */
	public static boolean login(String username,String password){
		// ������Ч�ַ�������
		BufferedReader br = null;
		try {
			// �����ļ�����
			File file = new File("user.txt");
			// �ж��ļ��Ƿ����
			if(!file.exists()) {
				// �����ļ�
				file.createNewFile();
				// ��¼ʧ��
				return false;
			}
			// ������Ч�ַ�������
			br = new BufferedReader(new FileReader(file));
			// ����������ն�ȡ��ÿһ������
			String line = null;
			// �����Ǽ�¼�û����Ƿ����
			boolean exist = false;
			// ѭ����ȡÿһ������
			while((line = br.readLine())!= null) {
				// ʹ��-�ָ�
				String[] strs = line.split("=");
				// �ж��û����Ƿ���ȷ
				if(strs[0].equals(username)) {
					exist = true;
					if(strs[1].equals(password)) {
						System.out.println("��¼�ɹ�");
						return true;
					} else {
						System.out.println("������󣬵�¼ʧ��");
						return false;
					}
				}
			}
			if(!exist) { // �û���������
				System.out.println("�û���������");
				// ע���˺�
				register(username,password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ر������ͷ���Դ
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	/*
	 * ע���û�����
	 */
	public static void register(String username,String password) throws IOException{
		// �����ַ����������
		BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
		// �����û�����I����
		bw.write(username);
		bw.write("=");
		bw.write(password);
		// д���з�
		bw.newLine();
		// �ر���
		bw.close();
	}
}
