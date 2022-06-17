package functionalstreams.streampipelines;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://hyperskill.org/learn/step/2449
 */
public class TenMostFrequentWords {
    public static void main(String[] args) {
        System.out.println(getInput());
    }

    static long getInput() {
        long result = 0;
        Scanner scanner = new Scanner(System.in);
        result = Arrays.stream(Stream.generate(scanner::nextLine)
                        .map(s -> s.split("\\s+"))
                        .distinct()
                        .toArray(String[]::new))
                .count();
//        try{
//            result = Arrays.stream(Stream.generate(scanner::nextLine)
//                    .map(s-> s.split("\\s+"))
//                    .distinct()
//                    .toArray(String[]::new))
//                    .count();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
        return result;
    }

}
