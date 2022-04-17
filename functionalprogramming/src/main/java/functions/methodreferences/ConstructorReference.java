package functions.methodreferences;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Given the following class containing getters and setters, how to write a method reference to the constructor of the class Journal?
 * https://hyperskill.org/learn/step/3341
 */
public class ConstructorReference {
    public static void main(String[] args) {
        //Function<String,Journal> journalGenerator = Journal::new;
        BiFunction<String, String, Journal> journalGenerator = Journal::new;
        System.out.println(journalGenerator.apply("Journal of Computer Science","Publisher House"));
    }
}

class Journal {

    String title;
    String publisher;

    public Journal(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
