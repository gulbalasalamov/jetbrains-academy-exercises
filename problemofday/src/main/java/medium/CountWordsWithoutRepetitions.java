package medium;

import java.util.*;

/**
 * https://hyperskill.org/learn/step/3830
 * Count the number of unique words ignoring case sensitivity for given lines with words.
 * The first line contains the number n. The next n lines contain words separated by a space.
 * <p>
 * Sample Input 1:
 * 3
 * Word word wORD
 * line Line SplinE word
 * spline align Java java
 * <p>
 * Sample Output 1:
 * 5
 */

public class CountWordsWithoutRepetitions {
    /**
     * Counts the number of unique words ignoring case sensitivity
     * for given lines with words.
     *
     * @param n     the n lines contain words
     * @param lines the list of lines, each line is a list of words
     * @return the number of unique words in lines ignoring case sensitivity
     */
    public static long count(int n, List<List<String>> lines) {
        // write your code here
        var set = new HashSet<String>();
        for (int i = 0; i < lines.size() && i < n; i++) {
            for (String s : lines.get(i)) {
                set.add(s.toLowerCase());
            }
        }
        return set.size();
    }

    /**
     * Using functional programming
     *
     * @param n
     * @param lines
     * @return
     */
    public static long count2(int n, List<List<String>> lines) {
        return lines.stream()
                .limit(n)
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .distinct()
                .count();
    }


    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<List<String>> lines = new ArrayList<>();
        String line;
        while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
            lines.add(Arrays.asList(line.split("\\s+")));
        }
        System.out.println(count(n, lines));
    }
}