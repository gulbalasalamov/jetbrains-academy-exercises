package functionalstreams.datafiltering;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Implement a method that returns the number of passwords from a given stream.
 * Please, use Java Stream API to solve the problem.
 * Sample Input 1:
 * sadfjvDdffg dsajkfj3 fdsv4 sdaffg5
 * <p>
 * Sample Output 1:
 * 4
 * <p>
 * https://hyperskill.org/learn/step/10236
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    /**
     * Returns the number of elements in a given stream.
     *
     * @param passwordStream the input stream of strings
     * @return the number of elements in a given stream
     */
    public static long countPasswords(Stream<String> passwordStream) {
        // write your code here
        return passwordStream.count();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countPasswords(Arrays.stream(scanner.nextLine().split("\\s+"))));
    }
}