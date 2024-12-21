package memorymanagement;

/*
* You'll be encounter below error once the maximum heap size reached.
* Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
*
* You can increase the heap size using VM Options: -Xmx5000m
* */
public class OutOfMemoryErrorSample {

    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i<Integer.MAX_VALUE; i++){
            int[] aArray = new int[size];
            size *= 2;
            System.out.println(size);
        }
    }
}
