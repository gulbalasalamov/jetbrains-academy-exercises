package functionalstreams.mapandflatmap;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * Find the maximum absolute value in the array of numbers.
 * Try not to use the for loop, but use Stream API.
 * https://hyperskill.org/learn/step/3828
 */
public class MaxOfAbsoluteValues {
    /**
     * Returns the largest absolute value in the array of numbers.
     *
     * @param numbers the input array of String integer numbers
     * @return the maximum integer absolute value in the array
     */
    public static int maxAbsValue(String[] numbers) {

        OptionalInt optionalInt = Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .map(Math::abs)
                .max();

        return optionalInt.isPresent() ? optionalInt.getAsInt() : 0;

    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(maxAbsValue(scanner.nextLine().split("\\s+")));
    }
}
