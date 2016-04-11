package org.java8.datamodel.movie;

/**
 * Created by Mayank on 4/10/2016.
 */
public class Movie {

    int rank;
    String name;
    boolean isComedy;

    public Movie(int rank, String name, boolean isComedy) {
        this.rank = rank;
        this.name = name;
        this.isComedy = isComedy;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
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