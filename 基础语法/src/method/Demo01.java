package method;

public class Demo01 {
    public static void main(String[] args) {
        double sum = add(1.0,2.0);
        System.out.println(sum);
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static int add(int a,int b,int c, int d){
        return a+b+c+d;
    }
    public static int add(int a,int b,int c,int d ,int e){
        return a+b+c+d+e;
    }
}
