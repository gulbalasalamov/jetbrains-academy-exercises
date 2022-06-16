package functionalstreams.streampipelines;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        var paradigms = Arrays.asList(
                "Aspect-oriented programming",
                "Functional programming",
                "Object-oriented programming",
                "Logical programming",
                "Procedural programming",
                "Automata-based programming"
        );

        var filtered = paradigms.stream()
                .filter(p -> p.contains("oriented") || p.contains("Functional"))
                .flatMap(p -> Arrays.stream(p.split("\\s+")))
                .distinct()
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}
