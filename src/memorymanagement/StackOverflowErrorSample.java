package memorymanagement;

/*
 * Initially hit with StackOverflowError due to the max size of stack is 1024kb/1mb -> No of computations around 20k
 * After providing VM Options as -Xss5m still hit with StackOverflowError due to the method is recursive.
 * But, the number of computations increased this time. -> No of computations around 1lak
 * */
public class StackOverflowErrorSample {

    public static void main(String[] args) {
        add(1);
    }

    private static void add(int i) {
        System.out.println(i);
        i++;
        add(i);
    }
}
