package com.itheima.level1_12;

/*
  2.����ѧ����(Student)
	a)����:name,score
	b)�ṩ�ղι���
	c)�ṩ�вι���;
		i.ʹ��setXxx���������ƺ�score��ֵ
	d)�ṩsetter��getter����
		i.��setScore(int score)������
			1.�����ж�,���scoreΪ����,���׳�NoScoreException,�쳣��ϢΪ:��������Ϊ����:xxx.
			2.Ȼ���ڸ���Աscore��ֵ.
 */
public class Student {
	private String name;
	private int score;
// �ղι���
	public Student() {
		super();
	}
//	c)�ṩ�вι���;
//	i.ʹ��setXxx���������ƺ�score��ֵ
	public Student(String name,int score){
		setName(name);
		setScore(score);
	}
//	d)�ṩsetter��getter����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}
//	i.��setScore(int score)������
	public void setScore(int score) {
//	1.�����ж�,���scoreΪ����,���׳�NoScoreException,�쳣��ϢΪ:��������Ϊ����:xxx.
		if(score < 0){
			throw new NoScoreException(":��������Ϊ����:"+score);
		}
//	2.Ȼ���ڸ���Աscore��ֵ.
		this.score = score;
	}
}
