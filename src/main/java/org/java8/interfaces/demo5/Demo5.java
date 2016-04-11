package org.java8.interfaces.demo5;

import java.util.function.Predicate;

/**
 * Created by Mayank on 4/10/2016.
 */
// Predicate :: is a functional interface provided by java to evaluate a condition and return boolean
public class Demo5 {

    /*@FunctionalInterface
    interface Predicate<T> {
        // Single abstract method
        boolean test(T t);
        // ..other methods such as and, or & negate
    }*/

    public static void main(String[] args) {

        Predicate<Employee> bonusLambda = (emp) -> emp.getRating() < 10 ? true : false;
        Predicate<Employee> execLambda = (emp) -> emp.getId().startsWith("E9") ? true : false;

        Employee empA = new Employee(54, "E939379");
        Employee empB = new Employee(3, "H9738378");

        System.out.println("\n" + empA.toString());
        System.out.println("Is eligible for bonus ? : " + bonusLambda.test(empA));
        System.out.println("Is an executive ? : " + execLambda.test(empA));

        System.out.println("\n" + empB.toString());
        System.out.println("Is eligible for bonus ? : " + bonusLambda.test(empB));
        System.out.println("Is an executive ? : " + execLambda.test(empB));

    }
}

class Employee {

    int rating;
    String id;

    Employee(int rating, String id) {
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
