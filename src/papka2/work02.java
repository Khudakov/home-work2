package papka2;

public class work02 {


    public static void main(String[] args) {
        myMethod2 (4,8);
        isPositive1(6);
        isPositive2(77);
        myTask( 5);
    }

    public static boolean myMethod1(int a, int b) {
        System.out.println("result1" + myMethod1(5, 2));
        return (a + b >= 10 && a + b <= 20);
    }


    public static boolean myMethod2(int c, int d) {
        int sum = c + d;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else     return false;
    }

    public static void isPositive1(int e) {
        if (e >= 0) {
            System.out.println( e + " is positive");
        } else {
            System.out.println( e + " is negative");
        }
    }


    public static boolean isPositive2(int x) {
        if (x <= 0) {
            return true;
        } else  return false;
    }

    public static void myTask(int number) {
        for (int i = 3; i <= number; i++) {
            System.out.println( i ++);
        }
    }














}

