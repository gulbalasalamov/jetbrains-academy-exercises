package functions.functionalinterfaces;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Implement a ternaryOperator method that accepts
 * a predicate condition,
 * and two functions ifTrue and ifFalse
 * and returns a function.
 * <p>
 * The returning function takes an argument, checks if condition predicate is true for this argument, and if it is — applies ifTrue function to the argument, otherwise,
 * it applies ifFalse function.
 * <p>
 * https://hyperskill.org/learn/step/2400
 */
public class TernaryOperator {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}
