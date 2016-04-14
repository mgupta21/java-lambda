package org.java8.util;

import org.java8.datamodel.movie.Movie;
import org.java8.datamodel.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 4/10/2016.
 */
public class MovieUtil {

    public static List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Jurassic Park", "Steven", 5, false));
        movies.add(new Movie("DDLJ", "Karan", 7, false));
        movies.add(new Movie("KHNH", "Karan", 11, true));
        movies.add(new Movie("Titanic", "Steven", 3, false));
        movies.add(new Movie("KNPH", "Roshan", 124, false));
        movies.add(new Movie("Terminal", "Steven", 6, false));
        movies.add(new Movie("Schindler's List", "Steven", 2, false));
        return movies;
    }

    public static Movie createMovie() {
        return new Movie("Titanic", "Steve", 3, false);
    }

    public static List<Movie> createMoviesWithActors() {
        List<Movie> movies = new ArrayList<>();
        movies.add(getMovieWithActors("Titanic", "Leonardo DiCaprio", "Kate Winslet"));
        movies.add(getMovieWithActors("Terminal", "Tom Hanks", "Catherine Zeta-Jones"));
        movies.add(getMovieWithActors("Bicentennial Man", "Robin Williams", "Hallie Eisenberg"));
        movies.add(getMovieWithActors("If Only", "Paul Nicholls", "Jennifer Love-Hewitt"));
        return movies;
    }

    private static Movie getMovieWithActors(String movieName, String actor, String acctress) {
        List<Person> actors = new ArrayList<>();
        actors.add(new Person(actor));
        actors.add(new Person(acctress));
        return new Movie(movieName, actors);
    }
}
