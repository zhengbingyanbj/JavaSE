package cn.itcast04.innercalss;
/*
 * �ڲ��� 
 *    ��һ������ڲ� ������һ���� 
 *    
 *    �ٸ����� 
 *      class A{
 *         class B{}
 *      }
 *      
 *      B��A���ڲ���
 *      A��B���ⲿ��
 *      
 *      �ڲ��ఴ��λ�� �ֳ����� 
 *        1����Ա�ڲ���
 *              �����ڳ�Աλ��   ���з����� 
 *              
 *        2���ֲ��ڲ���
 *             �����ھֲ�λ��    ������
 */
public class InnerClass {
     public static void main(String[] args) {
		//Heart h = new Heart();
    	 ZhiZunBao zzb = new ZhiZunBao();
    	 
    	 ZhiZunBao.Heart zzbh = new ZhiZunBao().new Heart();
    	 
    	 zzbh.speak();
	}
}
