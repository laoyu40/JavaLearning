package oop.demo09;

public class Outer {

    private int id;
    public void out() {
        System.out.println("这是外部类的方法");
    }

    public class Inner {
        public void in() {
            System.out.println("这是内部类的方法");
        }

    }

}
