package functions.functionalinterfaces;

/**
 * Write a lambda expression that accepts seven (!) string arguments and returns a string in uppercase concatenated from all of them (in the order of arguments).
 * Note. The correct solution may not work in your local environment because you don't have a suitable functional interface. The testing system has the interface and can test your solution.
 * Examples (only with two args): (x, y) -> x + y; (x, y) -> { return x + y; };
 * <p>
 * Sample Input:
 * The lambda has too many string arguments.
 * <p>
 * Sample Output:
 * THELAMBDAHASTOOMANYSTRINGARGUMENTS.
 */
public class LambdaWithSevenArguments {
    public static void main(String[] args) {

    }
    public static SeptenaryStringFunction fun = LambdaWithSevenArguments::conc;

    public static String conc(String... strings) {
        return String.join("", strings).toUpperCase();
    }

}

@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
}