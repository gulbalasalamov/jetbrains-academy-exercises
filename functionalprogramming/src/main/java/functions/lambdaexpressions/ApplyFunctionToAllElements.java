package functions.lambdaexpressions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

/**
 * implement a method that applies the given function to all elements of the input array.
 * Do not create a new array, just change the elements of the original one.
 * https://hyperskill.org/learn/step/4330
 */
public class ApplyFunctionToAllElements {
    public static <T> void applyFunction(T[] array, Function<T, T> func) {
        // Option1
//        for (int i = 0; i < array.length; i++) {
//            array[i] = func.apply(array[i]);
//        }
        //Option 2
        Arrays.setAll(array, (int i) -> func.apply(array[i]));

    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String method = scanner.nextLine();
        String[] array = scanner.nextLine().split(" ");
        applyFunction(array,
                "lower".equals(method) ? String::toLowerCase :
                        "upper".equals(method) ? String::toUpperCase :
                                "new".equals(method) ? String::new :
                                        "trim".equals(method) ? String::trim : String::intern);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
