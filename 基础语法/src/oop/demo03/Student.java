package oop.demo03;

public class Student {
    private String name;
    private int id;
    private char gender;
    private int age;
    //get、set方法
    //get 获得这个数据
    public String getName() {
        return this.name;
    }
    //set 给这个数据设置值
    public void setName(String name) {
        this.name = name;
    }
    //alt + insert
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 500 || age < 0) {
            this.age = 3;//这么无聊的人，很明显是幼儿园没毕业
        }
        else {
            this.age = age;
        }
    }
}
