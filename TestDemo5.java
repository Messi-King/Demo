
public class TestDemo {

    public static int max(int a,int b) {
        return a > b ? a:b;
    }

    public static double max(double a,double b) {
        return a > b ? a:b;
    }

    //建议：返回值的类型 最好是匹配的 不要出现当前这种情况
    public static double max(double a,double b,int c) {
        double ret = max(a,b);
        if(ret > c) {
            return ret;
        }else {
            return c;
        }
    }

    public static int floor(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return  2;
        }
        return floor(n-1)+floor(n-2);
    }

    public static int floorNor(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;
        for (int i = 3; i <= n ; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main(String[] args) {
        System.out.println(floorNor(1));
        System.out.println(floorNor(2));
        System.out.println(floorNor(3));
        System.out.println(floorNor(4));


        System.out.println(floor(10));


        /*int a = 10;
        double b = 10.9;
        if(a < b) {
            System.out.println("sdfsaa");
        }else {
            System.out.println("hello");
        }*/
    }
}
