package org.java8.lambda.demo6;

import org.java8.datamodel.movie.Movie;
import org.java8.util.MovieUtil;

import java.util.List;

/**
 * Created by Mayank on 4/3/2016.
 */
// Method References : referencing an existing method from lambda expression
// MR are shorthand to lambda expressions, used to make code more readable
public class Demo6 {

    interface IMovie {
        boolean check(Movie m);
    }

    public static void main(String[] args) {

        // Declaring the reference to a method but not invoking method
        IMovie movieTop10Lambda = Demo6::isTop10;
        IMovie movieClassicLambda = Demo6::isClassic;
        IMovie movieComedyLambda = Demo6::isComedy;

        List<Movie> movies = MovieUtil.createMovies();

        movies.forEach(m -> {
            System.out.println("****\nMovie Name : " + m.getName());
            System.out.println("Is Classic Movie ? : " + movieClassicLambda.check(m));
            System.out.println("Is Top 10 Movie ? : " + movieTop10Lambda.check(m));
            System.out.println("Is Comedy Movie ? : " + movieComedyLambda.check(m) + "\n");
        });
    }

    public static boolean isClassic(Movie m) {
        return m.getRank() <= 100;
    }

    public static boolean isTop10(Movie m) {
        return m.getRank() <= 10;
    }

    public static boolean isComedy(Movie m) {
        return m.isComedy();
    }

}
