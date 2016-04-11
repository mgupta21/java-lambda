package org.java8.interfaces.demo7;

import org.java8.datamodel.movie.Movie;
import java.util.function.Consumer;

/**
 * Created by Mayank on 4/10/2016.
 */
// Interface that accepts an argument but returns nothing
/*interface Consumer<T> {
    void accept(T t);
    // default andThen method..
}*/

public class ConsumerFuncionalInterface {

    public static Consumer<Movie> printInfo = m -> System.out.println(m.toString());
    public static Consumer<Movie> persistMovie = m -> System.out.println("Persisted movie '" + m.getName() + "' to database.");
    public static Consumer<Movie> notifyMovie = m -> System.out.println("Notifying movie : " + m.getName());

    public static Consumer<Movie> printAndPersistMovie = printInfo.andThen(persistMovie);
    public static Consumer<Movie> chainedConsumer = notifyMovie.andThen(persistMovie).andThen(printInfo);

    public static void testConsumer(Movie m) {
        System.out.println("\nTesing Comsumer");
        printInfo.accept(m);
        persistMovie.accept(m);
    }

    public static void testConsumerAndThen(Movie m) {
        System.out.println("\nTesting Consumer and Then");
        printAndPersistMovie.accept(m);
        System.out.println();
        chainedConsumer.accept(m);
    }

    public static void main(String[] args) {

        Movie m = new Movie(3, "TITANIC", false);

        testConsumer(m);
        testConsumerAndThen(m);

    }

}
