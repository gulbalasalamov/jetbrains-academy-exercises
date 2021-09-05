package functions.lambdaexpressions;

import java.util.function.LongUnaryOperator;

/**
 * Write a lambda expression that accepts a long value and returns the next even number.
 * It is guaranteed that the input number is non-negative.
 * https://hyperskill.org/learn/step/2364
 */
public class NextEvenNumber {
    public static LongUnaryOperator unaryOperator = num -> num % 2 != 0 ? num + 1 : num + 2;
}
