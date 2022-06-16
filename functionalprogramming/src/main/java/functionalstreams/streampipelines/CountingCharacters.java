package functionalstreams.streampipelines;

import java.util.Arrays;

public class CountingCharacters {
    public static void main(String[] args) {
        var characters = Arrays.asList('z', '1', 'e', 'Z', 'q', 'd', '8', 'E');
        var count = characters.stream()
                .filter(Character::isLetter)
                .map(Character::toUpperCase)
                .count();
        System.out.println(count);
    }
}
