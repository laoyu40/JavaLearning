package method;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println(f(10));//5!
    }

    public static long f(long n) {
        if (n == 1) {
            return 1;
        }else {
            return n*f(n-1L);
        }
    }
}
