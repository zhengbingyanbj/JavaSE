package com.itheima.level1_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
11. ʹ�ô���ʵ��
 	дһ��ʵ�ְ��ַ���������,д����Ŀ��Ŀ¼�µ�content.txt�ļ���
 	
1.������(Test11)
2.дһ����̬���� void write(String content),�ڷ�����
		a)�����ַ��������������BufferedWriter bw;
		b)дһ��try{   }catch(IOException e){  }finally{ }�����
		c)��try{ }�ڴ������	
			i.����BufferedWriter����,��content.txt�ļ�,��ֵ��bw
			ii.����bw��write()����,����content
		d)��catch�������,��ӡ�쳣��Ϣ
		e)��finally�����ر���
			i.дtry{}catch(IOException ex){} �����
			ii.��try �������,���bw!=null,����bw.close()����
			iii.��catch�����,��ӡ�쳣��Ϣ
3.��main�����е���write(String conent)����
 */
public class Test11 {
	
//	дһ����̬���� void write(String content)
	public static void write(String content){
//		a)�����ַ��������������BufferedWriter bw,��ʼֵΪnull;
		BufferedWriter bw = null;
//		b)дһ��try{   }catch(IOException e){  }finally{ }�����
		try{
//		c)��try{ }�ڴ������	
//			i.����BufferedWriter����,��content.txt�ļ�,��ֵ��bw
			bw = new BufferedWriter(new FileWriter("content.txt"));
//			ii.����bw��write()����,����content
			bw.write(content);
		}catch(IOException e){
//		d)��catch�������,��ӡ�쳣��Ϣ
			e.printStackTrace();
		}finally{
//		e)��finally�����ر���
//			i.дtry{}catch(IOException ex){} �����
			try{
//			ii.��try �������,���bw!=null,����bw.close()����
				if(bw != null){
					bw.close();
				}
			}catch(IOException ex){
//			iii.��catch�����,��ӡ�쳣��Ϣ
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		write("�Ұ�Java,�Ұ��������Ա");
	}
}
