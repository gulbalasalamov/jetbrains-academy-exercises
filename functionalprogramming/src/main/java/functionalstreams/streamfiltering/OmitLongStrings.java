package functionalstreams.streamfiltering;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Implement the omitLongStrings method that takes a list of strings and returns a stream that consists of the elements from a given list that are less than 4 characters long.
 *
 * Example: ["a", "bbb", "cccc", "dddddd"] → ["a", "bbb"]
 * Please, use streams to solve the problem.
 * https://hyperskill.org/learn/step/2425
 */
public class OmitLongStrings {
    private static Stream<String> omitLongStrings(List<String> strings) {
        // write your code here
        return strings.stream()
                .filter(s -> s.length() < 4);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        omitLongStrings(list).forEach(System.out::println);
    }
}
