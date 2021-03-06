package cn.itcast.interfaceclass;
/*
 *   研究 抽象类 和 接口 之间 相同点 和不同点  
 *   
 *     相同点
 *       1：抽象类 和接口 都位于 继承体系的顶层 
 *       2：都可以有抽象方法 这些抽象方法 子类必须重写
 *       3：都不能 直接创建对象
 *    不同点：
 *       1：抽象类 有构造  接口没有
 *       2：抽象类可以有非抽象方法  接口只有抽象方法
 *         抽象类为部分方法提供实现,避免子类重复实现这些方法,提高代码重用性
 *       3：一个类只能继承一个抽象类     但是可以实现多个接口
 *       4：抽象类中 定义共性的功能  
 *         接口中定义扩展功能  作为一种规范存在
 *         
 *       开发的时候 
 *         优先选择接口
 *          需要定义子类的行为,又要为子类提供共性功能时才选用抽象类
 */
public class Demo {

}
