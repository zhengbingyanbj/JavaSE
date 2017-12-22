package cn.itcast.employeetest;
/*
 * 案例操作步骤  
 *   1：创建员工类 Employee 这个类也是抽象的 
 *      成员变量  id  name 
 *      构造方法  空参 满参
 *      成员方法  abstract work()
 *            set get
 *            
 *   2:创建研发部类  继承 员工类  也得是抽象
 *     Develop 
 *       成员变量 无
 *       构造方法      要  空参 满参 
 *       成员方法  无
 *       
 *   3：创建Maintain 维护部 
 *      类似于 Develop
 *      
 *   4：创建JAVAEE工程师  
 *         成员变量 无
 *         构造方法      要  空参 满参 
 *         成员方法    重写 work()
 *         
 *    自行补充剩下三个
 */
public class Demo {
    public static void main(String[] args) {
		//创建javaee对象
    	JAVAEE ee = new JAVAEE(9527, "华安");
    	
    	ee.work();
    	
	}
}
