package functions.optional;

import java.util.Optional;

//https://youtu.be/vKVzRbsMnTQ

public class OptionalTutorial {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("Huseyin");
        Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 0)); // provides default value instead of throwing error
        Cat myCat2 = optionalCat.orElseThrow(); // Optional.get() same. Difference is that this can throw error. if optional containts value, it returns. If Optional empty, it will throw no such element exception.
        optionalCat.map(Cat::getAge).orElse(0);

    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


