package cn.itcast.override;
/*
 *   ����ֻ�
 *   
 *     Phone   
 *        ��绰 
 *        ������
 *        
 *     ���׻��ֻ�
 *     
 *        ��绰
 *           ����������� ���Լ����е�ʵ�ַ�ʽ
 *        ������
 *        
 *        ��д�ĺô�
 *          1����Ϯ�˸����ж���Ĺ���
 *          2�����Խ���Ϯ�Ĺ��� ʵ�� �Լ����е�����
 */
public class Demo {
    public static void main(String[] args) {
	    //�������ֻ� ����
    	BoomRiceFlowerPhone p = new BoomRiceFlowerPhone();
    	
    	p.callSo("�೤");//���õ�������д��Ĺ���
    	
    	p.sendMess();//���õ��� �����ж���Ĺ���
	}
}
