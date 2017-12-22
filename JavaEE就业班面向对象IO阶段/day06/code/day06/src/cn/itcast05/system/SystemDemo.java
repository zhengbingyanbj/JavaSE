package cn.itcast05.system;
/*
 *  System.in
 *  System.out
 *  
 *  ��API��System����ܵıȽϼ򵥣����Ǹ������壬
 *  System�д����������ϵͳ���ṩ�˶�Ӧ��һЩϵͳ������Ϣ����ϵͳ����
 *  
 *  �����涨����������� �ͷ��� ���� ��̬�� 
 *    ��̬�� ��ͨ����  �������Ա  �������޹� 
 *    
 *    ����������еĹ�����˽��
 *    System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������
 *    
 *       static long currentTimeMillis() 
 *         �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣 
 *       static void exit(int status) 
 *          ��ֹ��ǰ�������е� Java ������� 
 *       static void gc()  
 *           ����������������
 *       static String getProperty(String key) 
 *          ��ȡϵͳ��Ϣ 
 *       
 */
public class SystemDemo {
     public static void main(String[] args) {
	     //��ȡ��ǰʱ�����ֵ
    	 long start = System.currentTimeMillis();
    	 
    	 System.out.println("��׷�ҡ�����");
    	 
    	 for(int i = 0; i<100000;i++){
    		 System.out.println("׷"+i);
    	 }
    	 System.out.println("׷����");
    	 
    	 //ִ��֮��
    	 long end = System.currentTimeMillis();
    	 
    	 System.out.println(end-start);
    	 
    	 System.out.println("��ȡϵͳ��Ϣ");
    	 
    	 String version = System.getProperty("java.version");
    	 
    	 System.out.println(version);
	 }
}
