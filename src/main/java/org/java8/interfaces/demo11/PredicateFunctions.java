package org.java8.interfaces.demo11;

import org.java8.datamodel.employee.Department;
import org.java8.datamodel.employee.Employee;
import org.java8.datamodel.employee.Level;

import java.util.function.*;

/**
 * Created by Mayank on 4/11/2016.
 */
public class PredicateFunctions {

    public static void main(String[] args) {

        Predicate<Integer> evenNumberPredicate = x -> x % 2 == 0;
        Predicate<Double> doublePredicate = x -> x > 10;

        // Out of box primitives

        // Predicates
        IntPredicate evenNumberPredicate2 = x -> x % 2 == 0;
        DoublePredicate doublePredicate2 = x -> x > 10;

        // Consumers
        IntConsumer intConsumer = i -> System.out.println(i);
        LongConsumer longConsumer = l -> System.out.println(l);

        // Suppliers
        IntSupplier intSupplier = () -> 4;
        LongSupplier longSupplier = () -> 5L;

        // Functions
        Function<Integer, Employee> employeeFunction = x -> new Employee("E0000", "John", Department.MARKETING, Level.SENIOR, x);
        IntFunction<Employee> employeeIntFunction2 = x -> new Employee("E0000", "Mark", Department.TECHNOLOGY, Level.INTERMEDIATE, x);

        DoubleToIntFunction doubleToIntFunction = x -> (int) (x + 2);
        LongToDoubleFunction longToDoubleFunction = x -> (double) (x + x);

        System.out.println(doubleToIntFunction.applyAsInt(5.0));
        System.out.println(longToDoubleFunction.applyAsDouble(23L));

    }

}
