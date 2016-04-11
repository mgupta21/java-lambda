package org.java8.util;

import org.java8.datamodel.movie.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 4/10/2016.
 */
public class MovieUtil {

    public static List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(7, "DDLJ", false));
        movies.add(new Movie(11, "KHNH", true));
        movies.add(new Movie(3, "TITANIC", false));
        movies.add(new Movie(123, "KNPH", false));
        return movies;
    }
}
