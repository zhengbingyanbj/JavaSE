package com.itheima.level3_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 ��ʹ�ô�������
         ��names.txt�е�����,��ȡ��������,�洢��ArrayList������;ÿһ������ΪArrayList������һ��Ԫ��;
        Ҫ��:ʹ��try...catch...finally���쳣���д���  
 
1.������:com.itheima.level3_02
2.������Test18
3.�ṩmain����,��main������
	a)��ArrayList���϶���,���ڴ洢����
	b)����BufferedReader���ͱ��� br,��ʼֵΪnull
	c)дtry..catch...finally�����
	d)��try�������
		i.����BufferedReader����,��names.txt�ļ�,��ֵ��br
		ii.�����ַ�������line,���ڴ洢��ȡ��������
		iii.ʹ��ѭ��,ÿ�ζ�һ��,��ӵ�������
	e)��catch�������,��ӡ�쳣��Ϣ
	f)��finnaly��������ͷ���Դ
		i.���br��Ϊnull,�͵���br��close����
		ii.����ر��쳣
    g)��ӡ����list
 */
public class Test18 {
	public static void main(String[] args) {
//		a)��ArrayList���϶���,���ڴ洢����
		ArrayList<String> list = new ArrayList<>();
//		b)����BufferedReader���ͱ��� br,��ʼֵΪnull
		BufferedReader br = null;
//		c)дtry..catch...finally�����
		try{
//		d)��try�������
//			i.����BufferedReader����,��names.txt�ļ�,��ֵ��br
			 br = new BufferedReader(new FileReader("names.txt"));
//			ii.�����ַ�������line,���ڴ洢��ȡ��������
			 String line;
//			iii.ʹ��ѭ��,ÿ�ζ�һ��,��ӵ�������
			 while((line = br.readLine())!=null){
					 list.add(line);
			 }
		}catch(IOException e){
//		e)��catch�������,��ӡ�쳣��Ϣ
			e.printStackTrace();
		}finally{
//		f)��finnaly��������ͷ���Դ
			try{
	//			i.���br��Ϊnull,�͵���br��close����
				if(br!=null){
					br.close();
				}
//			ii.����ر��쳣
			}catch(IOException e){
				e.printStackTrace();
			}
		}
//	    g)��ӡ����list
		System.out.println(list);
	}
}
