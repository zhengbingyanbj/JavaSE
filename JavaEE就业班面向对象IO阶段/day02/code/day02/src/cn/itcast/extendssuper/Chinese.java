package cn.itcast.extendssuper;
/*
 * ��������ʼ�����֮ǰ ��ɸ��ࣨ�������� ��ʼ��
 */
public class Chinese extends Person{
    //��Ա����
	private String address;
	//�ղι���
	public Chinese(){
		super();//��������ʼ��֮ǰ ��ɸ����ʼ��ʱ ѡ��Ŀղι���
	}
	//����
	public Chinese(String name,int age,String address){
		super(name,age);//��������ʼ�����֮ǰ ��ɸ��ࣨ�������� ��ʼ��
		      //Ҫ��ɸ�������ʼ�� ��ô����Ҫ֪��ʹ�ø����е��ĸ���������ʼ��
		      //����д����仰super(name,age)����˵���� �丸���ʼ��ʱ�õĹ���
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
