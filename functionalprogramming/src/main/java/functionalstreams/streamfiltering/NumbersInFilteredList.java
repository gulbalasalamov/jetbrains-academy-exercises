package functionalstreams.streamfiltering;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumbersInFilteredList {
    public static void main(String[] args) {
        var numbers = Arrays.asList(4,5,3,8,6,2,7);
        var filtered = numbers.stream()
                .filter(n-> n * n < 36)
                .collect(Collectors.toList());
        filtered.forEach(System.out::print);
    }
}
