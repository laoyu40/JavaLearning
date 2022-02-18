package base;

public class Demo01 {
    public static void main(String[] args) {
        //八大基本数据类型

        //整数
        int num1 = 10;//最常用
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L;//Long要在数字后面加个L

        //小数：浮点数
        float num5 = 50.1F;//Float要在数字后面加个F
        double num6 = 3.141592653589793238462643383279;

        //字符
        char name = 'A';
        //字符串,String不是关键字，类
        //String namea = "余浩正";

        //布尔值：是非
        boolean flag = true;
        char name1 = '余';
        char name2 = '浩';
        char name3 = '正';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println((int)name1);
        System.out.println((int)name2);
        System.out.println((int)name3);
        int y = 20313;
        int h = 28009;
        int z = 27491;
        System.out.println((char)y);
        System.out.println((char)h);
        System.out.println((char)z);
    }
}
