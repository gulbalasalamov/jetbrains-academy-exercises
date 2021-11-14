package medium;

import java.util.Scanner;

/**
 * https://hyperskill.org/learn/daily/5016
 * <p>
 * Suppose there are three boys in a sports class.
 * <p>
 * You need to write a program that checks if the boys are arranged in ascending or descending order by height.
 * The program must read three integer numbers h1, h2, h3 and outputs true or false.
 * If boys have the same height, they are considered as correctly arranged.
 * <p>
 * Sample Input 1:
 * 165 161 158
 * Sample Output 1:
 * true
 * <p>
 * Sample Input 2:
 * 155 165 160
 * Sample Output 2:
 * false
 * <p>
 * Sample Input 3:
 * 161 161 165
 * Sample Output 3:
 * true
 */
public class CheckAscendingDescending {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var a = scanner.nextInt();
            var b = scanner.nextInt();
            var c = scanner.nextInt();
            System.out.println(checkAscDesc(a, b, c) ? "true" : "false");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean checkAscDesc(int a, int b, int c) {
        return a <= b && b <= c || a >= b && b >= c;
    }
}
