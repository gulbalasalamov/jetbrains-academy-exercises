package functionalstreams.streampipelines;

import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumOfOddNumbers {
    public static void main(String[] args) {
      //  calculateSum(0,0);
        System.out.println(calculateSumOfOddNumbersInRange(7,9));
        System.out.println(calculateSumOfOddNumbersInRange(0,0));
        System.out.println(calculateSumOfOddNumbersInRange(21,30));
    }

    public static long calculateSumOfOddNumbersInRange(long start, long end) {
        return LongStream.rangeClosed(start, end)
                .filter(x -> x % 2 != 0)
                .sum();
    }
}
