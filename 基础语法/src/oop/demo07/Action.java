package oop.demo07;

//abstract 抽象类：接口extends：单继承 （接口可以多继承）
public abstract class Action {

    //约束 有人帮我们实现
    //abstract，抽象方法，只有方法名字没有方法的实现
    public abstract void doSomething();
    //1. 不能new抽象类，只能靠子类去实现它
    //2. 抽象类可以写普通方法
    //3. 抽象方法必须写在抽象类中
    //抽象的抽象：约束


    public Action() {
        System.out.println("123");
    }
}
