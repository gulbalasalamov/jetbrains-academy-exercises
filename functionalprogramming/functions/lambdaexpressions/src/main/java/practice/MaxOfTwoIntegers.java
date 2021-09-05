package practice;

import java.util.function.IntBinaryOperator;

/**
 * Write a lambda expression that accepts two integer arguments and returns max of them.
 * Try not to use the Math library.
 * https://hyperskill.org/learn/step/2363
 */
public class MaxOfTwoIntegers {
    public static IntBinaryOperator binaryOperator =
            //BiFunction<Integer, Integer, Integer> max = (n1, n2) -> n1 + n2;
            //BiFunction<Integer, Integer, Integer> max = Integer::sum;
            (num1, num2) -> num1 > num2 ? num1 : num2;
}
