package functionalstreams.streampipelines;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        var numbers = Arrays.asList(-1, 0, 1, -2, 2, 3, -4, 5, -6);
        var result = numbers.stream()
                .filter(n -> n<4)
                .map(n -> n * n)
                .filter(n -> n <10)//
                .distinct()
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
