package com.itheima.test02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test02_02 {
	/*
	 * ʹ�ø�Ч�������ȡ��һ�Ᵽ��ѧ����Ϣ���ļ���ÿ�ζ�ȡһ����Ϣ��
	ÿ��ȡ��һ����Ϣ�ʹ���һ��ѧ��������ӵ������С�
	�������ϴ�ӡѧ����Ϣ������̨��
	 */
	public static void main(String[] args) throws IOException {
		// ������Ч���ַ�������
		BufferedReader br = new BufferedReader(new FileReader("c:/stu.txt"));
		// ���弯�ϴ��ѧ������
		List<Student> stus = new ArrayList<Student>();
		// �����ַ������ն�ȡ������
		String line = null;
		// ʹ��ѭ�����ļ��ж�ȡ����
		while((line = br.readLine()) != null) {
			// ʹ��-�ָ��ַ���
			String[] strs = line.split("-");
			// ����ѧ������
			Student stu = new Student(strs[0],strs[1]);
			// ��ѧ����ӵ�������
			stus.add(stu);
		}
		// �����ͷ���Դ
		br.close();
		
		// �������ϴ�ӡѧ����Ϣ
		for (Student student : stus) {
			System.out.println(student.getId()+"="+student.getName());
		}
	}
}

class Student{
	// ѧ��
	private String id;
	// ����
	private String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}