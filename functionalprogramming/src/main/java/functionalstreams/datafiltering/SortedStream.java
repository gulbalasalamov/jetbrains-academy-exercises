package functionalstreams.datafiltering;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Implement a method that prints out sorted elements of a given stream of strings.
 * Please, use Java Stream API to solve the problem.
 * https://hyperskill.org/learn/step/10238
 */

public class SortedStream {
    /**
     * Prints sorted elements of a given stream of strings.
     *
     * @param wordStream the input stream of strings
     */
    public static void sortAndPrint(Stream<String> wordStream) {
        // write your code here
        wordStream
                .sorted()
                .forEach(System.out::println);
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sortAndPrint(Arrays.stream(scanner.nextLine().split("\\s+")));
    }
}
