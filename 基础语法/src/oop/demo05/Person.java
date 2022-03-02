package oop.demo05;

public class Person {
    public void run() {
        System.out.println("run");
    }
}




/*
多态注意事项：
1. 多态是方法的多态，属性没有多态
2. 父类和子类，有联系 类型转换异常！ClassCastException!
3. 存在的条件: 继承关系，方法需要重写，父类引用指向子类对象！ Father f1 = new Son();

    1. static方法，属于类，不属于实例
    2. final 常量
    3. private方法
 */