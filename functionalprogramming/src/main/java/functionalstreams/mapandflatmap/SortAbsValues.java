package functionalstreams.mapandflatmap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Write a code that returns an array of sorted integer absolute numbers of the given array. The elements should be sorted in ascending order.
 * Try not to use the for loop, but use Stream API.
 * https://hyperskill.org/learn/step/3829
 */
public class SortAbsValues {
    /**
     * Returns the sorted array of absolute numbers in ascending order.
     *
     * @param numbers the input array of String integer numbers
     * @return the sorted array of integer absolute numbers
     */
    public static int[] sortedAbsNumbers(String[] numbers) {
        // write your code here
        return Arrays.stream(numbers)
                .mapToInt(Integer::valueOf)
                .map(Math::abs)
                .sorted()
                .toArray();



    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.stream(sortedAbsNumbers(scanner.nextLine().split("\\s+")))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "))
        );
    }
}
