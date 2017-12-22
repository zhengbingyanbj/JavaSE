package com.itheima.level3_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 ��֪����ArrayList����, �������ᡱ,������,����˼�⡱,��¹�ϡ�; �Ѽ���������д�뵱ǰ��Ŀ�ĸ�Ŀ¼�µ�names.txt��,ÿһ������ռһ��;
Ҫ��: ʹ��try...catch...finally���쳣���д���


1.������:com.itheima.level3_01
2.������Test17
3.�ṩmain����,��main������
	a)����ArrayList���϶���list
	b)�򼯺�list���������
	c)����BufferedWriter���� br,��ʼ��ֵΪnull
	d)дtry...catch...finally�����
	e)��try�������
		i.����BufferedWriter����,��Ŀ��names.txt,��ֵbw
		ii.����list����,�ڱ����Ĺ�����,дһ������,дһ������,��flush
	f)��catch�������,��ӡ�쳣��Ϣ
	g)��finally������йر���
		i.���bw��Ϊnull,�͵���bw.close()����
		ii.ʹ��try...catch�����쳣
 */
public class Test17 {
	public static void main(String[] args) {
//		a)����ArrayList���϶���list
	    ArrayList<String> list = new ArrayList<>();
//		b)�򼯺�list���������
	    list.add("������");
	    list.add("����");
	    list.add("��˼��");
	    list.add("¹��");
//		c)����BufferedWriter���� br,��ʼ��ֵΪnull
	    BufferedWriter bw = null;
//		d)дtry...catch...finally�����
	    try{
//		e)��try�������
//			i.����BufferedWriter����,��Ŀ��names.txt,��ֵbw
	      bw = new BufferedWriter(new FileWriter("names.txt"));
//			ii.����list����,�ڱ����Ĺ�����,дһ������,дһ������,��flush
	      for(int i=0; i<list.size(); i++){
	    	  String name = list.get(i);
	    	  bw.write(name);
	    	  bw.newLine();
	    	  bw.flush();
	      }
	      
	    }catch(IOException e){
//		f)��catch�������,��ӡ�쳣��Ϣ
	    	e.printStackTrace();
	    }finally{
//		g)��finally������йر���
//			i.���bw��Ϊnull,�͵���bw.close()����
	    	
	    	try{
		    	if(bw != null){
		    		bw.close();
		    	}
	    	}catch(IOException ex){
//				ii.ʹ��try...catch�����쳣
	    		ex.printStackTrace();
	    	}
	    }
	}
}
