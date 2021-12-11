package medium;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://hyperskill.org/learn/daily/2743
 * Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.
 * Note: it is possible to write this program more efficiently without any loops.
 */
public class CountNumbersDivisibleByN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //System.out.println(countNumOfDivisible(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
            System.out.println(countDivisible(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * A method to calculate total number of divisible number n using for loop
     *
     * @param a rangeStart
     * @param b rangeEnd
     * @param n divisible number
     * @return total number of divisible number n
     */
    static int countNumOfDivisible(int a, int b, int n) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                ++count;
            }
        }
        return count;
    }

    /**
     * A method to calculate total number of divisible number n using the Stream
     *
     * @param a rangeStart
     * @param b rangeEnd
     * @param n divisibleNumber
     * @return total of divisible number n
     */
    static int countDivisible(int a, int b, int n) {
        return (int) IntStream.rangeClosed(a, b).filter(i -> i % n == 0).count();
    }
}
