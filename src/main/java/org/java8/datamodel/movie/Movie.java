package org.java8.datamodel.movie;

import org.java8.datamodel.person.Person;

import java.util.List;

/**
 * Created by Mayank on 4/10/2016.
 */
public class Movie {

    int rank;
    String name;
    String director;
    boolean isComedy;

    List<Person> actors;


    public Movie(String name) {
        this(name, "UNKNOWN");
    }

    public Movie(String name, String director) {
        this(name, director, Integer.MAX_VALUE, false);
    }

    public Movie(String name, String director, int rank, boolean isComedy) {
        this.name = name.toUpperCase();
        this.director = director;
        this.rank = rank;
        this.isComedy = isComedy;
    }

    public Movie(String name, List<Person> actors) {
        this.name = name.toUpperCase();
        this.actors = actors;
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

    public List<Person> getActors() {
        return actors;
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