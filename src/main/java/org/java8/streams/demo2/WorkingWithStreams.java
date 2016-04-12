package org.java8.streams.demo2;

import org.java8.datamodel.movie.Movie;
import org.java8.util.MovieUtil;

import java.util.List;

/**
 * Created by Mayank on 4/11/2016.
 */
public class WorkingWithStreams {

    private static List<Movie> movies = MovieUtil.createMovies();

    private static void findMoviesByDirector() {
        System.out.println("\nMovies of Steven Spielberg : ");
        movies.stream()
                .filter(m -> m.getDirector().equals("Steven") ? true : false)
                .forEach(System.out::println);
    }

    private static void findMovieNamesByDirector() {
        System.out.println("\nMovies of Steven Spielberg by name : ");
        movies.stream()
                .filter(m -> m.getDirector().equals("Steven") ? true : false)
                .map(Movie::getName)
                .forEach(System.out::println);
    }

    private static void findFirsThreeMovieByDirector() {
        System.out.println("\nFirst 3 Movies of Steven Spielberg");
        movies.stream()
                .filter(m -> m.getDirector().equals("Steven") ? true : false)
                .map(Movie::getName)
                .limit(3)
                .distinct()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        findMoviesByDirector();
        findMovieNamesByDirector();
        findFirsThreeMovieByDirector();
    }

}
