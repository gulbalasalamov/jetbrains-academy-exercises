package functions.lambdaexpressions;

import java.util.function.DoubleUnaryOperator;

/**
 * Using closure write a lambda expression that calculates a∗x2+b∗x+c where a, b, c are context final variables.
 * They will be available in the context during testing. Note, the result is double.
 * Solution format. Submit your lambda expression in any valid format with ; on the end.
 * Examples: (x, y) -> x + y; (x, y) -> { return x + y; }
 * https://hyperskill.org/learn/step/2367
 */
public class ExpressionClosure {
    public static int a = 10;
    public static int b = 20;
    public static int c = 30;

    public static DoubleUnaryOperator unaryOperator = // Write your code here
            num -> a * num * num + b * num + c;
}
