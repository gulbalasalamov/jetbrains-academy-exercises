package functionalstreams.streampipelines;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumOfNumbers {
    public static void main(String[] args) {
        var numbers = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);

        long result = numbers.stream()
                .filter(n -> n%2==0)
                .mapToInt(x -> x)
                .sum();

        System.out.println(result);


        int sum = IntStream.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println(sum);

        OptionalInt reduce = IntStream.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
                .filter(n-> n%2==0)
                .reduce(Integer::sum);

        reduce.ifPresent(System.out::println);

    }
}
