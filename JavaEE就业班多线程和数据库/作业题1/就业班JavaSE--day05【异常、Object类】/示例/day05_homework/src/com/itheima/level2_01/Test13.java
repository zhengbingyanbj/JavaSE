package com.itheima.level2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 ��ʹ�ô���ʵ��
	дһ���������ڸ����ı��ļ�;
	Ҫ��:ʹ��try...catch...finally���쳣���д���
	
1.���������Test13
	a)дһ�������ļ��ľ�̬����:copyFile(String src,String dest) 
		i.�����srcΪԴ�ļ�·��,destΪĿ���ļ�·��
		ii.����BufferedReader br����
		iii.����BufferedWriter bw ����
		iv.дtry...catch...finally�����
		v.��try�������
			1.����BufferedReader�Ķ���,��Դ�ļ�,���Ѷ���ֵ��br
			2.����BufferedWriter�Ķ���,��Ŀ���ļ�,���Ѷ���ֵ��bw
			3.����һ���ַ����� chs,����Ϊ1024,������ʱ�洢��ȡ��������
			4.�������ͱ���len,���ڼ�¼��ȡ������Ч�ֽڸ���
			5.ʹ��whileѭ��,��һ���ַ�����,дһ���ַ�����,��ˢ����
		vi.��catch�������,��ӡ�쳣��Ϣ
		vii.��finally�����
			1.дһ��try...catch�����
			2.��try�������: ���bw��Ϊnull�͹ر�bw
			3.��catch������д�ӡ�쳣��Ϣ
			4.��дһ��try...catch�����
			5.��try�������,���br��Ϊnull�͹ر�br
			6.��catch�����д�ӡ�쳣��Ϣ
	b)�ṩmain����,��main������
		i.��main����,���øո�дcopyFile����,����Դ�ļ�·����Ŀ���ļ�·��
 */
public class Test13 {
//	a)дһ�������ļ��ľ�̬����:copyFile(String src,String dest) 
	public static void copyFile(String src,String dest){
//		i.�����srcΪԴ�ļ�·��,destΪĿ���ļ�·��
//		ii.����BufferedReader br����
		BufferedReader br = null;
//		iii.����BufferedWriter bw ����
		BufferedWriter bw = null;
//		iv.дtry...catch...finally�����
		try{
//		v.��try�������
//			1.����BufferedReader�Ķ���,��Դ�ļ�,���Ѷ���ֵ��br
			br = new BufferedReader(new FileReader(src));
//			2.����BufferedWriter�Ķ���,��Ŀ���ļ�,���Ѷ���ֵ��bw
			bw = new BufferedWriter(new FileWriter(dest));
//			3.����һ���ַ����� chs,����Ϊ1024,������ʱ�洢��ȡ��������
			char[] chs = new char[1024];
//			4.�������ͱ���len,���ڼ�¼��ȡ������Ч�ֽڸ���
			int len = 0;
//			5.ʹ��whileѭ��,��һ���ַ�����,дһ���ַ�����,��ˢ����
			while((len = br.read(chs))!=-1){
				bw.write(chs, 0, len);
			}
		}catch(IOException e){
//		vi.��catch�������,��ӡ�쳣��Ϣ
			e.printStackTrace();
		}finally{
//		vii.��finally�����
//			1.дһ��try...catch�����
			try{
//			2.��try�������: ���bw��Ϊnull�͹ر�bw
				if(bw != null){
					bw.close();
				}
			}catch(IOException ex){
//			3.��catch������д�ӡ�쳣��Ϣ
				ex.printStackTrace();
			}
			
//			4.��дһ��try...catch�����
			try{
//			5.��try�������,���br��Ϊnull�͹ر�br
				if(br!=null){
					br.close();
				}
			}catch(IOException ex){
//			6.��catch�����д�ӡ�쳣��Ϣ
				ex.printStackTrace();
			}
		}
	}
	
//	i.��main����,���øո�дcopyFile����,����Դ�ļ�·����Ŀ���ļ�·��
	public static void main(String[] args) {
		copyFile("content.txt", "13.txt");
	}
}
