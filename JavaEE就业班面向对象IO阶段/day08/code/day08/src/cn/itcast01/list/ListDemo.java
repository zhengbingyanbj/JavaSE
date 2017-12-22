package cn.itcast01.list;

import java.util.ArrayList;
import java.util.List;

/*
 * 有序的 collection（也称为序列）。此接口的用户可以对列表中每个元素的插入位置进行精确地控制
 *      
 *      List集合 是 有序集合 特点 元素有索引  存取顺序一致 
 *        可以准确的找到某个位置的元素 
 *        
 *        那么这里特有的功能都跟索引相关的 
 */
public class ListDemo {
     public static void main(String[] args) {
		  
    	 //创建List集合对象
    	 List<String> list = new ArrayList<String>();
    	 
    	 //添加元素到集合  有索引了 所以 是添加到集合的最后
    	 list.add("黄忠");
    	 list.add("马可波罗");
    	 list.add("狄仁杰");
    	 
    	 System.out.println(list);
	      //add(int index,String s)  在指定位置添加元素
    	 list.add(1, "嬴政");
    	 
    	 System.out.println(list);
    	 
    	 //String remove(int index) 删除指定位置元素 并返回被删除的元素
    	 System.out.println("删除索引位置为2的元素");
    	 System.out.println(list.remove(2));
    	 System.out.println(list);
    	 
         // String set(int index,String newE)
    	 // 用新的元素替换掉指定位置元素 返回被替换的元素
    	 System.out.println("谁被替换了："+list.set(0, "鲁班七号"));
    	 System.out.println(list);
    	 
    	 
    	 // String get(int index) 获取指定位置元素
    	 //size()  完成遍历
    	 for(int i = 0;i<list.size();i++){
    		 System.out.println(list.get(i));
    	 }
    	 
    	 
    	 
     }
}
