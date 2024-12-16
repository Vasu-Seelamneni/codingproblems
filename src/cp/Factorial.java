package cp;

public class Factorial {

    public static Integer factorial(int x) {

        int result = x;
        int y = x;
        for(int i=1; i<y; i++) {
            result = result * (x-1);
            x--;
        }

        return result;
    }

    public static Integer factorial2(int x) {

        int result = 1;
        for(int i=1; i<=x; i++) {
            result = result * i;
        }

        return result;
    }

    public static Integer recursivefactorial(int x) {
        if(x == 0) {
            return 1;
        } else {
            return x * recursivefactorial(x-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorial2(5));
        System.out.println(recursivefactorial(5));
    }
}
