package com.itheima.test03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Test03_01 {
	/*
	 ��ѧ�������ѧ�ţ�������ʡ��֤�ţ�Java�ɼ�����ѧ�ɼ���Ӣ��ɼ��ȳ�Ա�������ṩ���췽����setter��getter������
	Ҫ��
		* ѧ����Ϣ���ɼ����浽C�̵�save.txt�ļ���
		* ѧ�����֤���벻�ܱ��浽�ļ��С�
		* ��������ʱ���save.txt�����ڣ���
			�Ӽ���¼��1��ѧ����Ϣ����Ϣ¼���ʽ���£�
				***** ¼��ѧ����Ϣ *****
				������ѧ�ţ�9527
				����������������
				���������֤�ţ�2203919831234543
				������Java�ɼ���90
				��������ѧ�ɼ���80
				������Ӣ��ɼ���88
			
				����¼�����Ϣ����ѧ�����󲢽�ѧ�����󱣴浽C���µ�save.txt�ļ��С�
		* �����������ʱ��save.txt�ļ��Ѿ����ڣ�����ʾѧ����Ϣ����ʽ���£�
		**** ѧ��������Ϣ *****
		ѧ��  ���� ʡ��֤��  Java�ɼ�  ��ѧ�ɼ�  Ӣ��ɼ�
		9527  ����   null      90        80        88
	 */
	public static void main(String[] args) throws Exception {
		// �����ļ�·�������ļ�����
		File file = new File("c:/save.txt");
		if(file.exists()) { // �ļ�����
			System.out.println("************ ѧ��������Ϣ ************");
			// ������������������
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Student stu = (Student) ois.readObject();
			System.out.println("ѧ��\t����\tʡ��֤��\tJava�ɼ�\t��ѧ�ɼ�\tӢ��ɼ�");
			System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+ stu.getIdCard()+"\t  " + stu.getJavaScore()+"\t  "
			+ stu.getMathScore()+"\t  "+ stu.getEnglishScore()+"\t  ");
			// �ر���
			ois.close();
		} else { // �ļ�������
			// �����ļ�
			file.createNewFile();
			// ��������¼�����
			Scanner sc = new Scanner(System.in);
			// ¼��ѧ����Ϣ
			System.out.println("************ ¼��ѧ����Ϣ ************");
			System.out.print("������ѧ�ţ�");
			String id = sc.nextLine();
			System.out.print("������������");
			String name = sc.nextLine();
			System.out.print("���������֤�ţ�");
			String idCard = sc.nextLine();
			System.out.print("������Java�ɼ���");
			String javaScore = sc.nextLine();
			System.out.print("��������ѧ�ɼ���");
			String mathScore = sc.nextLine();
			System.out.print("������Ӣ��ɼ���");
			String englishScore = sc.nextLine();
			// ����ѧ������
			Student stu = new Student(id, name, idCard, javaScore, mathScore, englishScore);
			System.out.println(stu);
			// �������������
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(stu);
			// �ر���
			oos.close();
		}
	}
}

class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private transient String idCard;
	private String javaScore;
	private String mathScore;
	private String englishScore;
	
	public Student(String id, String name, String idCard, String javaScore, String mathScore, String englishScore) {
		super();
		this.id = id;
		this.name = name;
		this.idCard = idCard;
		this.javaScore = javaScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(String javaScore) {
		this.javaScore = javaScore;
	}
	public String getMathScore() {
		return mathScore;
	}
	public void setMathScore(String mathScore) {
		this.mathScore = mathScore;
	}
	public String getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(String englishScore) {
		this.englishScore = englishScore;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", idCard=" + idCard + ", javaScore=" + javaScore
				+ ", mathScore=" + mathScore + ", englishScore=" + englishScore + "]";
	}
}
