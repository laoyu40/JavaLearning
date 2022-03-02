package oop;

import oop.demo04.A;
import oop.demo04.B;

public class Application {
    //静态和非静态方法区别很大!
    //静态方法的调用只和左边，定义的数据类型有关
    //非静态才存在重写
    public static void main(String[] args) {
        A a = new A();
        a.test(); //A

        //父类的引用指向了子类
        B b = new A(); //子类重写了父类的方法
        b.test(); //B
    }
}
