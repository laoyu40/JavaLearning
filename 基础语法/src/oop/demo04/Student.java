package oop.demo04;

public class Student extends Person {
    public Student() {
        //隐藏代码：调用了父类的无参构造
        System.out.println("Student无参执行了");
    }
    //Ctrl + H
    private String name = "老余";
    public void print() {
        System.out.println("Student");
    }
    public void test1() {
        print();
        this.print();
        super.print();
    }
    public void test2(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
