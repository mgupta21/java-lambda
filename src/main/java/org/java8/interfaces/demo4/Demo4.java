package org.java8.interfaces.demo4;

/**
 * Created by Mayank on 4/10/2016.
 */
// Functions and Predicate

interface Movie {
    boolean isClassic(int movieId);
}

interface Person {
    boolean isEmployee(int empId);
}

interface Hospital {
    void admit(String patient);
}

interface Predicate<T> {
    // Interface Movie and Person can be replaced by common interface Predicate
    // Predicate is a function inteface that takes a variable and returns boolean
    boolean test(T t);
}

public class Demo4 {
}
