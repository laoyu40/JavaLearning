package base;

public class Demo02 {
    String name;
    int age;
    byte b;
    double d;
    static int salary = 2500;
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);

        Demo02 demo02 = new Demo02();
        System.out.println(demo02.age);
        System.out.println(demo02.name);
        System.out.println(demo02.b);
        System.out.println(demo02.d);
        System.out.println(salary);
    }

    public void add(){

    }
}
