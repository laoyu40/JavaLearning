package oop.demo04;

//在Java中，所有的类，都默认直接或者间接继承Object
public class Person /*extends Object*/ {
    public Person() {
        System.out.println("Person无参执行了");
    }

    protected String name = "余浩正";
    //私有的东西无法被继承！
    public void print() {
        System.out.println("Person");
    }
}
