package functions.optional;

import java.util.List;
import java.util.Optional;

/**
 * Method getValues of ValueProvider class returns List<Optional<Integer>> result.
 *
 * class ValueProvider {
 *     public List<Optional<Integer>> getValues() {
 *         // hidden code
 *     }
 * }
 * Write a code in the Main class that sums up all values and prints the result. If Optional object is empty, just skip it.
 *
 * Sample Input:
 * 3
 * 1
 * 2
 * 3
 *
 * Sample Output:
 * 6
 *
 * Sample Input:
 * 5
 * 1
 * 2
 * null
 * 4
 * 5
 *
 * Sample Output:
 * 12
 */
public class SumUpOptionalValues {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        // use provider.getValues() to get List<Optional<Integer>>
        List<Optional<Integer>> optionals = provider.getValues();
        int sum = 0;
        int num = 0;
        for (Optional o : optionals) {
            if (o.isPresent()) {
                num = (int) o.get();
                sum += num;
            }
        }
        System.out.println(sum);
    }

}
