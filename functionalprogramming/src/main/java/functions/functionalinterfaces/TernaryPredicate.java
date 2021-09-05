package functions.functionalinterfaces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Write your own functional interface called TernaryIntPredicate and use it with a lambda expression.
 * The interface must have a single non-static (and non-default) method called test that accepts three int arguments and returns a boolean value.
 * Also, write a lambda expression of the TernaryIntPredicate type with three int arguments.
 * The lambda expression should return true if all passed values are different, otherwise it should return false.
 * The expression should be assigned to a static field named allValuesAreDifferentPredicate.
 * There is a template to be used for your solution. Please, do not change it.
 * <p>
 * Sample Input:
 * 1 1 1
 * Sample Output:
 * False
 * Sample Input:
 * 2 3 4
 * Sample Output:
 * True
 * https://hyperskill.org/learn/step/2370
 */
public class TernaryPredicate {
    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int a, int b, int c);
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (e1, e2, e3) -> {
        Set<Integer> tempSet = new HashSet<>(Arrays.asList(e1, e2, e3));
        return tempSet.size() == 3;
    };

}
