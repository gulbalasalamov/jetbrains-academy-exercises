package functionalstreams.streamfiltering;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * You need to implement the isPrime method to check whether the input number is prime or not.
 * It's guaranteed that input value is always greater than 1 (i.e. 2, 3, 4, 5, ....). Use the provided template for your method.
 * A prime number is a value greater than 1 that has no positive divisors other than 1 and itself. More details are here.
 * This problem has a simple and clear solution with streams. Please, do not use loops.
 * https://hyperskill.org/learn/step/2423
 *
 */
public class PrimeNumbers {
    /**
     * Checking if a number is prime
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    private static boolean isPrime(long number) {
        // write your code here
        return LongStream.range(0, number)
                .filter(n -> number % n == 0)
                .count() == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();

        int n = Integer.parseInt(line);

        System.out.println(isPrime(n) ? "True" : "False");
    }
}
