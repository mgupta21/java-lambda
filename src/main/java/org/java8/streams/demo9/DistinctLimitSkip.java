package org.java8.streams.demo9;

import org.java8.datamodel.employee.Department;
import org.java8.datamodel.employee.Employee;
import org.java8.util.EmployeeUtil;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Mayank on 4/12/2016.
 */
public class DistinctLimitSkip {

    private static List<Employee> employees = EmployeeUtil.createEmployees();

    private static void testDistinct() {
        System.out.println("\nDistinct Results : ");
        Stream<Department> empDepStream = employees.stream()
                .map(Employee::getDepartment)
                .distinct();

        empDepStream.forEach(System.out::println);
    }

    private static void testLimit() {
        System.out.println("\nLimited Results : ");
        Stream<Department> empDepStream = employees.stream()
                .map(Employee::getDepartment)
                .limit(2);

        empDepStream.forEach(System.out::println);
    }

    private static void testSkip() {
        System.out.println("\nSkipped Results : ");
        Stream<Department> empDepStream = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .skip(2);

        empDepStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        testDistinct();
        testLimit();
        testSkip();
    }
}
