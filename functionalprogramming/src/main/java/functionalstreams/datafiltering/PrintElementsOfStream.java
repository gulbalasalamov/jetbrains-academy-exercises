package functionalstreams.datafiltering;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Implement a method that prints out each element from a given stream of numbers except the first two elements.
 *
 * Please, use Java Stream API to solve the problem.
 * Report a typo
 *
 * Sample Input 1:
 *
 * 1 1 3 5 7 9
 *
 * Sample Output 1:
 *
 * 3
 * 5
 * 7
 * 9
 */
public class PrintElementsOfStream {
    /**
     * Prints each element from a given stream except first 2 elements.
     *
     * @param stream the input stream of integers
     */
    public static void printStream(Stream<Integer> stream) {
        // write your code here
        stream.skip(2).forEach(System.out::println);
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printStream(Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt));
    }

}
