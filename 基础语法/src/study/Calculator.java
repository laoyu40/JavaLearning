package study;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char ch = ' ';
        double num1 = 0.0;
        double num2 = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你需要进行的运算的符号(+、-、*、/)：");
        if (scanner.hasNext()) {
            ch = scanner.next().charAt(0);
        }
        System.out.println("请输入第一个数字：");
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
        }
        System.out.println("请输入第二个数字：");
        if (scanner.hasNextDouble()) {
            num2 = scanner.nextDouble();
        }
        switch(ch) {
            case '+':
                System.out.println("两个数的和为"+add(num1, num2));
                break;
            case '-':
                System.out.println("两个数的差为"+minus(num1, num2));
                break;
            case '*':
                System.out.println("两个数的积为"+multiply(num1, num2));
                break;
            case '/':
                System.out.println("两个数的商为"+divide(num1, num2));
                break;
        }
        scanner.close();
    }

    public static double add(double a,double b) {
        return a+b;
    }
    public static double minus(double a,double b) {
        return a-b;
    }
    public static double multiply(double a,double b) {
        return a*b;
    }
    public static double divide(double a,double b) {
        if (b == 0) {
            System.out.println("不能除以0！");
            return 0;
        }
        return a/b;
    }
}
