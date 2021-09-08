package functionalstreams.reductionmethods;

import java.util.Arrays;
import java.util.List;

public class PersonAge {
    public static void main(String[] args) {
        //Given a list of persons:
        List<Person> persons = Arrays.asList(
                new Person("Mary", 18),
                new Person("John", 21),
                new Person("Andrew", 31),
                new Person("Julia", 19)
        );

        Person person = persons.stream()
                .reduce(new Person("DEFAULT", 0), (p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2); //max()

        System.out.println(person);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}