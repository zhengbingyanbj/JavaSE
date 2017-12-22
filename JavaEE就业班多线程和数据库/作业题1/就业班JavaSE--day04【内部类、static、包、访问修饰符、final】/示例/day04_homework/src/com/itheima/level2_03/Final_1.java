package com.itheima.level2_03;

//1.验证:final修饰类不可以被继承，但是可以继承其他类

//被final修饰的类
public class Final_1 {

}

final class FinalClass extends Final_1{ }
//验证:被final修饰的类可以继承其他类

//class Sub extends FinalClass{ } //编译报错
/*
错误原因: The type Sub cannot subclass the final class FinalClass
//翻译: 被final修饰的类不能有子类; 也就是说被final修饰的类不能被继承
*/

