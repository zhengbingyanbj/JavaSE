package cn.itcast02.iterator;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ţ��for  
 *     ��ǿfor  foreachѭ��
 *     
 *     ��ʽ
 *       for(����������Ԫ�ص���������  ���ձ�����  : Ҫ�������������Collectio����){
 *           ���ձ����� �Ϳ��Խ� ������ÿһ��Ԫ�ؽ��յ���
 *       }
 *     
 *     ������ǿfor�ĵײ��ǵ�����  ������ǿforֻ����ɱ��� 
 */
public class NBFor {
   public static void main(String[] args) {
	   
//	   int[] arr = {2,3,1,3};
//	   
//	   for(int i = 0;i<arr.length;i++){
//		   int a = arr[i];
//		   System.out.println(a);
//	   }
//	   System.out.println("-------------------------------");
//	   for(int a: arr){
//		   System.out.println(a);
//	   }
	   
	   Collection<String>  coll = new ArrayList<String>();
	   coll.add("��������");
	   coll.add("�����Ȱ�");
	   coll.add("�������");
	   
	   for(String s:coll){
		   System.out.println(s);
	   }
   }
}
