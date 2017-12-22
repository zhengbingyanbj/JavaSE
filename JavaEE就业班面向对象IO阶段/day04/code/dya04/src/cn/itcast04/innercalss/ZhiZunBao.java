package cn.itcast04.innercalss;
/*
 * 内部类 
 *    可以有自己的成员 
 *    还可以访问外部类成员 包括私有
 */
public class ZhiZunBao {
    
	private String lover = "紫霞仙子";
	
	class Heart{
		private String wife = "白晶晶";
		
		public void speak(){
			System.out.println("最爱的人："+lover);
			System.out.println("妻子是："+wife);
		}
	}
}
