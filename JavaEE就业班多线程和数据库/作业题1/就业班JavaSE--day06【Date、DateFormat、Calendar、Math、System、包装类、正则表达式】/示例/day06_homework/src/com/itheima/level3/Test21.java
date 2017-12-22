package com.itheima.level3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 ��ʹ��ʵ��:
��֪��Ŀ�ĸ�Ŀ¼����һ��student.txt,��������:
			 1       ������    Ů      30
			 2       ����      ��      35
			 3       ��ǿ      ��      38
			 4       ������    Ů      37
			 5       ��ɿ�    Ů      41
			 6       ������    Ů      30
			 7       ��С��    ��      28
���ļ���,ÿһ�б�ʾһ��ѧ����Ϣ,��ǰ����������ѧ��,����,����,����
Ҫ��: 
1.��ȡ�ļ�����,��ÿһ��ѧ����Ϣ��װΪһ��ѧ������,�洢��ArrayList������
2.��ӡ�����е�ѧ����Ϣ
3.����ƽ�����
4.�쳣����ʹ��throws�ķ�ʽ



1.����Ŀ�ĸ�Ŀ¼�´���student.txt�ļ�,�����ݿ���������ļ���
2.�ڰ�:com.itheima.level3��
3.����Student��
	a)����: ѧ��(id),����(name),�Ա�(sex),����(int age)
	b)�ṩ�ղ�,�вι��췽��,setters��getters����
	c)��дtoString()����
4.����Test21��,�ṩmain����,��main������
	a)����ArrayList���϶��� list,���ڴ洢��ȡ����ѧ������
	b)����BufferedReader����br,������Դ
	c)�����ַ�����str;
	d)ʹ��whileѭ��,ÿ�ζ�һ��,��ѭ����
		i.����trim����,ȡ����ȡ���ַ������˵Ŀո�
		ii.ʹ��split(��\\s+��) �������,�����ַ�������
		iii.�����Ԫ��0������ѧ��,1����������,2�������Ա�,3����������
		iv.���ַ���������ת��Ϊ����������
		v.�����вι���Student����s
		vi.��ѧ��������Ӽ�����
	e)����list����,��ӡÿһ��ѧ����Ϣ
	f)ͳ��ѧ����ƽ������
 */
public class Test21 {
	public static void main(String[] args) throws IOException {
//		a)����ArrayList���϶��� list,���ڴ洢��ȡ����ѧ������
		ArrayList<Student> list = new ArrayList<>();
//		b)����BufferedReader����br,������Դ
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
//		c)�����ַ�����str;
		String line;
//		d)ʹ��whileѭ��,ÿ�ζ�һ��,��ѭ����
		while((line=br.readLine())!=null){
//			i.����trim����,ȡ����ȡ���ַ������˵Ŀո�
			line = line.trim();
//			ii.ʹ��split(��\\s+��) �������,�����ַ�������
			String[] strs = line.split("\\s+");
//			iii.�����Ԫ��0������ѧ��,1����������,2�������Ա�,3����������
//			iv.���ַ���������ת��Ϊ����������
			int age = Integer.parseInt(strs[3]);
//			v.�����вι���Student����s
			Student s = new Student(strs[0],strs[1],strs[2], age);
//			vi.��ѧ��������Ӽ�����
			list.add(s);
		}
//		e)����list����,��ӡÿһ��ѧ����Ϣ
		for (Student student : list) {
			System.out.println(student);
		}
//		f)ͳ��ѧ����ƽ������
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getAge();
		}
//		����ƽ����
		double avg = (double)sum / list.size();
		System.out.println("ƽ������Ϊ:"+avg);
		
	}
}
