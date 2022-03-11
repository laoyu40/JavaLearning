package oop;

import oop.demo09.Outer;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
    }
}
/*
1. 父类引用指向子类的对象
2. 把子类转换为父类，向上转型
3. 把子类转换为父类，向下转型，强制转换
4. 方便方法的调用，减少重复的代码！简洁

抽象: 封装、继承、多态！ 抽象类，接口
 */
