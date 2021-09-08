package functionalstreams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DetermineValue {
    public static void main(String[] args) {
        int result = Stream.of(-1,2,-3,4)
                .collect(Collectors.reducing(0, x-> x>0 ? x : -x, (x,y) -> x+y));
        System.out.println(result);
    }
}
