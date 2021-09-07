package functionalstreams.datafiltering;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Implement a method for finding min and max elements of a stream in accordance with a given comparator.
 * The found elements pass to minMaxConsumer in the following way:
 * minMaxConsumer.accept(min, max);
 * If the stream doesn't contain any elements, invoke:
 * minMaxConsumer.accept(null, null);
 * Remember, that as soon as you call any terminal operation, the stream is closed and you can get IllegalStateException.
 * https://hyperskill.org/learn/step/2388
 */
public class FindMaxMinElement {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<? extends T> list = stream.collect(Collectors.toList());
        minMaxConsumer.accept(list.stream().min(order).orElse(null), list.stream().max(order).orElse(null));

        var v = stream.collect(Collectors.toList());
        var a = v.stream().min(order).orElse(null);
        var b = v.stream().min(order).orElse(null);
        minMaxConsumer.accept(a,b);


    }
}
