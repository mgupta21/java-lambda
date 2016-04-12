package org.java8.datamodel.movie;

/**
 * Created by Mayank on 4/10/2016.
 */
public class Movie {

    int rank;
    String name;
    String director;
    boolean isComedy;

    public Movie(String name) {
        this(name, "UNKNOWN");
    }

    public Movie(String name, String director) {
        this(name, director, Integer.MAX_VALUE, false);
    }

    public Movie(String name, String director, int rank, boolean isComedy) {
        this.name = name;
        this.director = director;
        this.rank = rank;
        this.isComedy = isComedy;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public boolean isComedy() {
        return isComedy;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                ", isComedy=" + isComedy +
                '}';
    }
}