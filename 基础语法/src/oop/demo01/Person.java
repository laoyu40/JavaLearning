package oop.demo01;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
/*
public static void main(String[] args) {
        Person person = new Person("余浩正",11);
        System.out.println(person.name);
    }
 */
