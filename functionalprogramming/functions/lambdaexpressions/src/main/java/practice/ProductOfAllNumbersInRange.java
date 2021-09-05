package practice;

import java.util.function.LongBinaryOperator;

/**
 * Write a lambda expression that accepts two long arguments as a range's borders
 * and calculates (returns) the product of all numbers in this range (inclusively).
 * It's guaranteed that 0 <= left border <= right border. If left border == right border, then the result is any border.
 * https://hyperskill.org/learn/step/2365
 */
public class ProductOfAllNumbersInRange {
    public static LongBinaryOperator binaryOperator = (num1, num2) -> {
        long result = 1;
        if (num1 != num2) {
            for (long i = num1; i <= num2; i++) {
                result *= i;
            }
        } else {
            result = num2;
        }
        return result;
    };
}
