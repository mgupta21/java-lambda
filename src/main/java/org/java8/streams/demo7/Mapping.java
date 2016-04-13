package org.java8.streams.demo7;

import org.java8.datamodel.employee.Employee;
import org.java8.util.EmployeeUtil;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Mayank on 4/12/2016.
 */
// Mapping is used to convert from one state to another state
public class Mapping {

    private static List<Employee> employees = EmployeeUtil.createEmployees();

    private static void testMapping() {
        Stream<String> nameStream = employees.stream()
                .map(Employee::getName)
                .map(String::toUpperCase);

        nameStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        testMapping();
    }

}
