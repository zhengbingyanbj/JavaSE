package cn.itcast06.digui;
/*
 *  递归
 *    在java中  方法内部 自己调用了自己 
 *    直接递归  研究这个
 *       a(){
 *         a();
 *       }
 *    间接递归
 *       a(){
 *          b();
 *       }
 *       b(){
 *         c();
 *       }
 *       c(){
 *         a();
 *       }
 *      递归注意事项： 
 *        当应用程序递归太深而发生堆栈溢出时，抛出该错误
 *        
 *        递归不宜过深
 *        递归一般必须有出口  
 *       
 */
public class DiGuiDemo {
       public static void main(String[] args) {
		   int n = 10000;
		   
		   int jc = getJC(n);
		   System.out.println(jc);
	   }
       
       /*
        * 求 n的阶乘 
        */
       public static int getJC(int n){
    	   
    	   if(n==1){
    		   return 1;
    	   }
    	   
    	   return n*getJC(n-1);
    	   
       }
}
