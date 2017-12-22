package cn.itcast.override;
/*
 *   设计手机
 *   
 *     Phone   
 *        打电话 
 *        发短信
 *        
 *     爆米花手机
 *     
 *        打电话
 *           在这个功能中 有自己特有的实现方式
 *        发短信
 *        
 *        重写的好处
 *          1：沿袭了父类中定义的功能
 *          2：可以将沿袭的功能 实现 自己特有的内容
 */
public class Demo {
    public static void main(String[] args) {
	    //创建新手机 对象
    	BoomRiceFlowerPhone p = new BoomRiceFlowerPhone();
    	
    	p.callSo("班长");//调用的子类重写后的功能
    	
    	p.sendMess();//调用的是 父类中定义的功能
	}
}
