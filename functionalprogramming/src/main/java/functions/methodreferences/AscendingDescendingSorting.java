package functions.methodreferences;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * It takes exactly two parameters: an array and a comparison function.
 * You need to create an object that represents a comparison function and assign it to the comparator variable.
 * The comparison function should take 2 parameters and return the minimum of them if the array should be sorted in ascending order, and the maximum of them if the array should be sorted in descending order.
 * Use isAscending variable to determine the sorting order. If the variable is true, then you need to sort the array in ascending order, otherwise, in descending order.
 * It is highly recommended to use method references to solve this task. There are several ways to do it, you can choose any of them. But if it is difficult for you, you can use lambda expressions as well.
 * https://hyperskill.org/learn/step/4329
 *
 * Sample Input:
 * ascending
 * 3 5 2 1 4
 *
 * Sample Output:
 * 1 2 3 4 5
 *
 * Sample Input:
 * descending
 * 3 5 2 1 4
 *
 * Sample Output:
 * 5 4 3 2 1
 */
public class AscendingDescendingSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAscending = scanner.nextLine().equals("ascending");
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        BiFunction<Integer, Integer, Integer> comparator = null;

        // write your code here
        comparator = isAscending ? Math::min : Math::max;
        sort(array, comparator);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    public static void sort(int[] array, BiFunction<Integer, Integer, Integer> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.apply(array[j], array[j + 1]) == array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
