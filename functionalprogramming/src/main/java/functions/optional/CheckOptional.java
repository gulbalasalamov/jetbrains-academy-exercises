package functions.optional;

/**
 * Method getValue of ValueProvider class returns Optional<String> result.
 *
 * class ValueProvider {
 *     public Optional<String> getValue() {
 *         // hidden code
 *     }
 * }
     * Write a code in the Main class that prints the returning value of the valueProvider.getValue if it is not null.
     */
public class CheckOptional {
    public static void main(String[] args) {
        //ValueProvider provider = new ValueProvider();
        //provider.getValue().ifPresent(System.out::println);
        // use provider.getValue() to get Optional<String>
        // Optional<String> opt = provider.getValue();
        // opt.ifPresent(name -> System.out.println(name));
    }
}
