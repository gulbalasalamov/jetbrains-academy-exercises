package functionalstreams.streamfiltering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        filter();
    }

    static void filter() {
        //list of prime numbers (a prime number is a whole number greater than 1 whose only factors are 1 and itself):
        List<Integer> primeNumbers = List.of(2, 3, 4, 5, 7, 11, 13, 17, 19);
        //New list consisting of prime numbers that belong to the range from 11 to 23 (inclusively).
        List<Integer> filteredPrimeNumbers = primeNumbers.stream()
                .filter(n -> n >= 11 && n <= 23)
                .collect(Collectors.toList());
        filteredPrimeNumbers.forEach(System.out::println);
    }

        static long multipleFilter() {
            List<String> programmingLanguages = Arrays.asList("Java", "", "scala", "Kotlin", "", "clojure");
            //count how many programming languages start with an upper letter ignoring all the empty strings.
            long count = programmingLanguages.stream()
                    .filter(x -> x.length() > 0)
                    .filter(x -> Character.isUpperCase(x.charAt(0)))
                    //filter(lang -> lang.length() > 0 && Character.isUpperCase(lang.charAt(0)))
                    .count();
            return count;
        }

}
