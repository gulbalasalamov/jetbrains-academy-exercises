package functions.optional;

import java.util.Optional;
import java.util.Scanner;

/**
 * Implement the method getValue of the InputStringReader class.
 * It should read a String value from the console and construct Optional<String> object based on the value.
 * If an input String equals empty, then create an empty Optional.
 * Use java.util.Scanner to read input data.
 * <p>
 * Sample Input:
 * abcd
 * <p>
 * Sample Output:
 * Value is present: abcd
 * <p>
 * Sample Input:
 * empty
 * <p>
 * Sample Output:
 * Value is empty
 */
public class CreateOptionalValue {
    public static void main(String[] args) {
        InputStringReader reader = new InputStringReader();
        Optional<String> value = reader.getValue();
        if (value.isPresent()) {
            System.out.println("Value is present: " + value.get());
        } else {
            System.out.println("Value is empty");
        }
    }
}

class InputStringReader {
    public Optional<String> getValue() {
        // implement
        String text = getInput();
        return !"empty".equals(text) ? Optional.ofNullable(text) :
                Optional.empty();
    }

    String getInput() {
        String input = "";
        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return input;
    }
}
