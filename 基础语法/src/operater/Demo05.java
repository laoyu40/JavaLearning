package operater;

//逻辑运算符
public class Demo05 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!a);

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<10);
        System.out.println(d);
        System.out.println(c);
    }
}
