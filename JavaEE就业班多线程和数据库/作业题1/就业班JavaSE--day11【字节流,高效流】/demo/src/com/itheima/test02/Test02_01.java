package com.itheima.test02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test02_01 {
	/*
	 *  �ӿ���̨ѭ�������û�¼���ѧ����Ϣ�������ʽΪ��ѧ��-ѧ������
		��ѧ����Ϣ���浽C�������stu.txt�ļ��У�һ��ѧ����Ϣռ��һ�����ݡ�
		���û�����endʱֹͣ���롣
	 */
	public static void main(String[] args) {
		try {
			// �����ֽ����������
			FileOutputStream fos = new FileOutputStream("c:/stu.txt");
			// ��������¼�����
			Scanner sc = new Scanner(System.in);
			System.out.println("������ѧ����Ϣ����ʽ��ѧ��-����");
			// ʹ����ѭ����ͣ�Ľ����û������ѧ������
			while(true) {
				// �����û������ѧ������
				String line = sc.nextLine();
				// �ж�����������Ƿ���end��������ֹѭ��
				if(line.equals("end")){
					System.out.println("����ɹ�");
					break;
				}
				// ������д�����ļ��С�
				fos.write(line.getBytes());
				// д�����з���
				fos.write("\n".getBytes());
			}
			// �ͷ���Դ
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
