package cn.itcast04.genericclass;
/*
 *   ���巺�����ʽ 
 *      ���η�  class ����<��������>{}
 *      
 *      ����  ��һ��δ֪����  
 *               δ��������   ����һ�־��������  ���Ϊռλ
 *               
 *           ���巺�Ϳ���������Ԥ֧��ʹ��δ֪������
 *           
 *  �� 
 *     GenericClass<String>  gc = new GenericClass<String>();
 *     
 *     ��ǰ���෢���ı���  
 public class GenericClass<String>{
    
	private String mvp;
	
	public  void setMVP(String mvp){
		this.mvp = mvp;
	}
	
	public String getMVP(){
		return mvp;
	}
}


 GenericClass<Integer>  gc2 = new GenericClass<Integer>();
 public class GenericClass<Integer>{
    
	private Integer mvp;
	
	public  void setMVP(Integer mvp){
		this.mvp = mvp;
	}
	
	public Integer getMVP(){
		return mvp;
	}
}
 
 */
public class GenericClass<MVP>{
    
	private MVP mvp;
	
	public  void setMVP(MVP mvp){
		this.mvp = mvp;
	}
	
	public MVP getMVP(){
		return mvp;
	}
}
