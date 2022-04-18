package functions.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

/**
 * There is a program with a class representing an address book. The class provides a method that returns the Optional address of a person by its name.
 * If the name is not present in the book, the method returns an empty Optional.
 * You need to complete the code to print the person's name and its address (separated by the phrase lives at) if the address is present and the "Unknown" string otherwise. It is highly recommended to use the methods of the Optional class to solve this problem.
 * Please do not add any additional characters in the output.
 *
 * Sample Input:
 * Christina Doss
 *
 * Sample Output:
 * Christina Doss lives at 7 Lincoln St., Matawan, NJ 07747
 *
 *
 * Sample Input:
 * Aubrey Curry
 *
 * Sample Output:
 * Unknown
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Optional<String> optAddress = AddressBook.getAddressByName(name);
        optAddress.ifPresentOrElse(
                (String address) -> System.out.println(name + " lives at " + address),
                () -> System.out.println("Unknown")
        );
        // write your code here
    }
}

/* Please, do not modify the code below */
class AddressBook {
    private static Map<String, String> namesToAddresses = new HashMap<>();

    static {
        namesToAddresses.put("Pansy Barrows", "63 Shub Farm Drive, Cumberland, RI 02864");
        namesToAddresses.put("Kevin Bolyard", "9526 Front Court, Hartsville, SC 29550");
        namesToAddresses.put("Earl Riley", "9197 Helen Street, West Bloomfield, MI 48322");
        namesToAddresses.put("Christina Doss", "7 Lincoln St., Matawan, NJ 07747");
    }

    static Optional<String> getAddressByName(String name) {
        return Optional.ofNullable(namesToAddresses.get(name));
    }
}