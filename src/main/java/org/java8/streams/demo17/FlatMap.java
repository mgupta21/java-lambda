package org.java8.streams.demo17;

import org.java8.datamodel.movie.Movie;
import org.java8.datamodel.person.Person;
import org.java8.util.MovieUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Mayank on 4/13/2016.
 */
public class FlatMap {

    private static List<Movie> movies = MovieUtil.createMoviesWithActors();
    private static String[] fruits = new String[]{"Apple", "Mango", "Banana"};
    private static String[] vegetables = new String[]{"Broccoli", "Carrot", "Tomato"};

    private static void flatMapMovies() {

        /*for(Movie movie : movies) {
            for (Person actor : movie.getActors()){
                System.out.println(actor);
            }
        }*/

        Stream<Person> actorStream = movies.stream().flatMap(m -> m.getActors().stream());
        actorStream.forEach(System.out::println);

    }

    private static void flatMapVeggies() {
        Stream<List<String>> veggies = Stream.of(Arrays.asList(fruits), Arrays.asList(vegetables));
        veggies.flatMap(v -> v.stream()).forEach(System.out::println);
    }


    public static void main(String[] args) {
        flatMapMovies();
        flatMapVeggies();
    }

}
