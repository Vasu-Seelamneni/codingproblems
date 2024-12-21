package codeproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 2, 1, 25, 15, 21, 21);
        Optional<Integer> result = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(result.isPresent()?result.get():"result is null");
    }
}
