package org.java8.datamodel.employee;

/**
 * Created by Mayank on 4/10/2016.
 */
public class Employee {

    int rating;
    String id;

    public Employee(int rating, String id) {
        this.rating = rating;
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rating=" + rating +
                ", id='" + id + '\'' +
                '}';
    }
}