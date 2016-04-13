package org.java8.streams.demo4;

import org.java8.datamodel.movie.Movie;
import org.java8.util.MovieUtil;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Mayank on 4/12/2016.
 */
public class LazyAndEagerStreams {

    private static List<Movie> movies = MovieUtil.createMovies();

    private static void testLazy() {
        // filter is a lazy method and is just creates another stream but can't produce any results
        Stream<Movie> movieStream = movies.stream()
                .filter(m -> {
                    System.out.println("Inside lazy operation 1");
                    return m.isComedy() ? true : false;
                });

    }

    private static void testLazyInvoked() {
        Stream<Movie> movieStream = movies.stream()
                .filter(m -> {
                    System.out.println("Inside lazy operation 2");
                    return m.isComedy() ? true : false;
                });

        System.out.println(movieStream.count()); // terminal operator invokes the pipeline and produce final results
    }

    private static void testEager() {
        Stream<Movie> movieStream = movies.stream()
                .filter(m -> {
                    System.out.println("filtering");
                    return m.isComedy() ? true : false;
                })
                .map(m -> { // map is also a lazy method
                    System.out.println("mapping");
                    return m;
                });

        System.out.println(movieStream.count());
    }

    public static void main(String[] args) {
        testLazy(); // Doesn't produce any output
        testLazyInvoked();
        testEager();
    }

}
