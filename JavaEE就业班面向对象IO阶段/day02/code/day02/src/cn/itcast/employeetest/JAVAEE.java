package cn.itcast.employeetest;

public class JAVAEE extends Develop{
   

	public JAVAEE() {}
	
	public JAVAEE(int id, String name) {
		super(id, name);
	}

	public void work() {
		//Ա����Ϊxxx�� xxxԱ���������з��Ա���վ
		System.out.println("Ա����Ϊ"+getId()+"��"+getName()+"Ա��,�����з��Ա���վ");
	}
	
	
}
