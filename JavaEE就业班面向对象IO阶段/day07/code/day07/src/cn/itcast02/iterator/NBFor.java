package cn.itcast02.iterator;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 牛掰for  
 *     增强for  foreach循环
 *     
 *     格式
 *       for(接收容器中元素的数据类型  接收变量名  : 要遍历的数组或者Collectio集合){
 *           接收变量名 就可以将 容器中每一个元素接收到；
 *       }
 *     
 *     集合增强for的底层是迭代器  所以增强for只能完成遍历 
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
	   coll.add("古力娜扎");
	   coll.add("迪丽热巴");
	   coll.add("马尔扎哈");
	   
	   for(String s:coll){
		   System.out.println(s);
	   }
   }
}
