package medium;

/**
 * Write a program that prints the following magic letter using * and whitespaces.
 * Use the provided code template.
 * Sample Output
 *
 * ********
 *       **
 *       **
 *       **
 * **    **
 * **    **
 *  *******
 * https://hyperskill.org/learn/step/3235
 */
public class PrintMagicLetter {
    public static void main(String[] args) {

        System.out.println("********\n" +
                "      **\n".repeat(3) +
                "**    **\n".repeat(2) +
                " *******");

//        System.out.println(
//                "********\n" +
//                        "      **\n" +
//                        "      **\n" +
//                        "      **\n" +
//                        "**    **\n" +
//                        "**    **\n" +
//                        " *******\n");
    }
}