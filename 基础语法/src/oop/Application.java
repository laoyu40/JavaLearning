package oop;

import oop.demo05.Person;
import oop.demo05.Student;

public class Application {
    public static void main(String[] args) {
        //类型之间的转化: 父 子

        //子类转换成父类，可能会丢失自己的一些方法！（相当于丢失精度）
        Student student = new Student();
        student.go();
        Person person = student;
    }
}
/*
1. 父类引用指向子类的对象
2. 把子类转换为父类，向上转型
3. 把子类转换为父类，向下转型，强制转换
4. 方便方法的调用，减少重复的代码！简洁

抽象: 封装、继承、多态！ 抽象类，接口
 */
