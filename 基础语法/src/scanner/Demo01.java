package scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入的内容为:"+str);
        }
        //IO流的类用完了要关闭，以免浪费资源
        scanner.close();

    }
}
