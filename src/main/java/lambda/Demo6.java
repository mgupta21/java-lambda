package lambda;

import java.util.ArrayList;
import java.util.List;

interface IMovie {
    boolean check(Movie m);
}

/**
 * Created by Mayank on 4/3/2016.
 */
// Method References : referencing an existing method from lambda expression
// MR are shorthand to lambda expressions, used to make code more readable
public class Demo6 {

    public static void main(String[] args) {

        // Declaring the reference to a method but not invoking method
        IMovie movieTop10Lambda = Demo6::isTop10;
        IMovie movieClassicLambda = Demo6::isClassic;
        IMovie movieComedyLambda = Demo6::isComedy;

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(7, "DDLJ", false));
        movies.add(new Movie(11, "KHNH", true));
        movies.add(new Movie(3, "TITANIC", false));
        movies.add(new Movie(123, "KNPH", false));

        movies.forEach(m -> {
            System.out.println("****\nMovie Name : " + m.name);
            System.out.println("Is Classic Movie ? : " + movieClassicLambda.check(m));
            System.out.println("Is Top 10 Movie ? : " + movieTop10Lambda.check(m));
            System.out.println("Is Comedy Movie ? : " + movieComedyLambda.check(m) + "\n");
        });
    }

    public static boolean isClassic(Movie m) {
        return m.rank <= 100;
    }

    public static boolean isTop10(Movie m) {
        return m.rank <= 10;
    }

    public static boolean isComedy(Movie m) {
        return m.isComedy;
    }

}

class Movie {
    int rank;
    String name;
    boolean isComedy;

    Movie(int rank, String name, boolean isComedy) {
        this.rank = rank;
        this.name = name;
        this.isComedy = isComedy;
    }
}
