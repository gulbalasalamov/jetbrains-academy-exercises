package medium;

/**
 * https://hyperskill.org/learn/daily/2478
 * <p>
 * Consider a method that takes a string and converts it to a double.
 * If the input string happens to be null or of an unsuitable format, a runtime exception occurs and the program fails.
 * Fix the method so it would catch any exception and return the default value 0 (zero) if an exception occurred.
 *
 * Sample Input:
 * 123.0
 * Sample Output:
 * 123.0
 *
 * Sample Input:
 * 15.5
 * Sample Output:
 * 15.5
 */
public class ExceptionHandling {
    public static double convertStringToDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException | NullPointerException e) {
            return 0;
        }
    }
}
