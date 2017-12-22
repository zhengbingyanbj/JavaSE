package cn.itcast04.genericclass;
/*
 *   定义泛型类格式 
 *      修饰符  class 类名<泛型名称>{}
 *      
 *      泛型  是一种未知类型  
 *               未来的类型   不是一种具体的类型  理解为占位
 *               
 *           定义泛型可以在类中预支地使用未知的类型
 *           
 *  当 
 *     GenericClass<String>  gc = new GenericClass<String>();
 *     
 *     当前的类发生改变了  
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
