package functions.functioncomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

/**
 * Write the disjunctAll method that accepts a list of IntPredicate objects and returns a single IntPredicate.
 * The result predicate is a disjunction of all input predicates.
 * Disjunction means that if any of the predicates would return true, the composed predicate should return true as well.
 * If the input list is empty, the resulted predicate must return false for any integer value (always false predicate).
 */
public class CombiningPredicates {
    /*
    * What to do:
    1. Check whether the list is emty. If yes, return lambda which will always return false for any input. Example: return x -> ....;
    2. Go through forEach loop with list and call IntPredicate.test(any initialized int).
    3. If any true - return lambda which will always return true for any input.
    4. If after point 3, false, then return lambda which will always return false for any input.*/
    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {

        IntPredicate result = x -> {
            return false;
        };

        for (IntPredicate predicate : predicates) {
            result = result.or(predicate);
        }

        return result;
//        IntPredicate res = predicates.get(0);
//        for(int i = 1; i < predicates.size(); i++){
//            res = res.or(predicates.get(i));
//        }
//        return res;
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        List<Boolean> values = Arrays.stream(strings)
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());

        List<IntPredicate> predicates = new ArrayList<>();
        values.forEach(v -> predicates.add(x -> v));

        System.out.println(disjunctAll(predicates).test(0));
        // added comment
    }
}
