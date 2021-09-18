import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.
 * The output should be true or false.
 * Sample Input 1:
 * 5 5 9
 * Sample Output 1:
 * false
 * https://hyperskill.org/learn/daily/3736#solutions
 */
public class CheckGivenNumbersDifferent {
    public static void main(String[] args) {
        System.out.println(getNumbers().size() == 3
                ? "true"
                : "false");
    }

    static Set<Integer> getNumbers() {
        Set<Integer> set = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                set.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }
}
