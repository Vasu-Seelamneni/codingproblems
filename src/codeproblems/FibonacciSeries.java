package codeproblems;

public class FibonacciSeries {

    public static void fibonacci(int x) {

        int a=0, b=1, fib;
        System.out.print(a + " " + b);
        for(int i=1; i<=x-2; i++){
            fib = a + b;
            System.out.print(" " + fib);
            a = b;
            b = fib;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
