package functionalstreams.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Implement the asciiArt method that takes the list of strings, joins them into a single string, and adds the ( symbol at the beginning of the resulting string and ) symbol at the end of the resulting string.
 * Remember to use the collect operation to solve the problem.
 * You may find the Collectors.joining method particularly useful.
 * https://hyperskill.org/learn/step/10519
 */
public class ASCIIArt {

    /**
     * Returns joined list elements with '(' for the prefix
     * and ')' for the suffix.
     *
     * @param symbols the input list of String elements
     * @return the result of joining
     */
    public static String asciiArt(List<String> symbols) {
        // write your code here
        Stream<List<String>> list = Stream.of(symbols);
        return symbols.stream()
                .collect(Collectors.joining("","(",")"));

    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> symbols = Arrays.asList(scanner.nextLine().split("\\s+"));
        System.out.println(asciiArt(symbols));

    }
}