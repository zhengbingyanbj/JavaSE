package cn.itcast06.digui;
/*
 *  �ݹ�
 *    ��java��  �����ڲ� �Լ��������Լ� 
 *    ֱ�ӵݹ�  �о����
 *       a(){
 *         a();
 *       }
 *    ��ӵݹ�
 *       a(){
 *          b();
 *       }
 *       b(){
 *         c();
 *       }
 *       c(){
 *         a();
 *       }
 *      �ݹ�ע����� 
 *        ��Ӧ�ó���ݹ�̫���������ջ���ʱ���׳��ô���
 *        
 *        �ݹ鲻�˹���
 *        �ݹ�һ������г���  
 *       
 */
public class DiGuiDemo {
       public static void main(String[] args) {
		   int n = 10000;
		   
		   int jc = getJC(n);
		   System.out.println(jc);
	   }
       
       /*
        * �� n�Ľ׳� 
        */
       public static int getJC(int n){
    	   
    	   if(n==1){
    		   return 1;
    	   }
    	   
    	   return n*getJC(n-1);
    	   
       }
}
