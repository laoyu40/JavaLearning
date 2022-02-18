package method;

public class Demo02 {
    public static void main(String[] args) {
        int max = max(10,10);
        System.out.println(max);
    }

    //比大小
    public static int max(int num1,int num2) {

        if (num1 == num2) {
            System.out.println("输入的两个数相等。");
            return 0;
        }

        return num1 > num2 ? num1 : num2;
    }
}
