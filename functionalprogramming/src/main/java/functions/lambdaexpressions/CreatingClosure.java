package functions.lambdaexpressions;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Write a lambda expression that adds PREFIX (before) and SUFFIX (after) to its single string argument;
 * PREFIX and SUFFIX are final variables. They are available in the code template.
 * All whitespaces on the both ends of the argument must be removed. Do not trim prefix, suffix and the result string.
 * https://hyperskill.org/learn/step/2368
 */
public class CreatingClosure {
    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = text -> PREFIX + text.trim() + SUFFIX;
    Function<String, String> fun = text -> PREFIX + text.trim() + SUFFIX;
}
