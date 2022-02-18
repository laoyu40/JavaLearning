package scanner;

import java.util.Scanner;

public class Demo05Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        System.out.println("请输入数据,输入完毕后请按下回车键，全部完毕请输入其他字符：");
        while (scanner.hasNextDouble()){
            double num = scanner.nextDouble();
            m++;
            sum += num;
            System.out.println("你输入了第"+m+"个数据,当前的和为"+sum+"，当前的平均数为"+(sum/m));
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均数为" + (sum/m));
        scanner.close();
    }
}
