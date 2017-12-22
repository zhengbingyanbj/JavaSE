package cn.itcast01.static01;
/*
 *  每个对象都有自己的堆空间  
 *     每个对象 都要为两个成员变量 开辟空间
 *     我们看到 这里代码中  
 *      有三个对象 
 *        每个球员的名字不一样 可以理解 
 *        可是 国籍是一样的  
 *        占了三块空间  
 *        
 *        能不能 这个国籍属性只占用一块空间 
 *        提供给多个对象共享
 *        
 *        能不能完成 可以 
 *        在我们 java中 有个关键字 static 
 *        状态修饰符  
 *        
 *        被它修饰的成员  可以被多个对象共享
 *        不再某一个对象
 */
public class Demo {
    public static void main(String[] args) {
		//创建一个对象
    	BBPlayer p1 = new BBPlayer();
    	p1.name = "詹姆斯";
    	p1.country="美国";
    	p1.show();
    	
    	//球员2
    	BBPlayer p2 = new BBPlayer();
    	p2.name = "库里";
    	//p2.country="美国";
    	p2.show();
    	
    	//球员3
    	BBPlayer p3 = new BBPlayer();
    	p3.name="林书豪";
    	//p3.country="美国";
    	p3.show();
	}
}
