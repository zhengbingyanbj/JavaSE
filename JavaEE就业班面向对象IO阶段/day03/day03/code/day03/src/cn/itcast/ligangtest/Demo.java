package cn.itcast.ligangtest;

public class Demo {
   public static void main(String[] args) {
	  // �̶� ذذ 
	   
	   //Ů�� ����   
	   // ���Ҫװ��
	   // ���������۾�  ñ��  �·�  ճ�Ϻ��� ���������
	   LiGangDie  kd = new LiGang();//����ת��
	   
	   System.out.println(kd.age);
	   
	   //��   
	   kd.teach();
	   
	   //����Ǯ �ؼ�  
//	   kd.playGame();
	   //жױ  ����ת��
	   LiGang lg = (LiGang)kd;
	   
	   lg.playGame();
	   
   }
}
