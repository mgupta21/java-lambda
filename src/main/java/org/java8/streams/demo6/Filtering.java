package org.java8.streams.demo6;

import org.java8.datamodel.employee.Department;
import org.java8.datamodel.employee.Employee;
import org.java8.util.EmployeeUtil;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Mayank on 4/12/2016.
 */
public class Filtering {

    private static List<Employee> employees = EmployeeUtil.createEmployees();

    private static void testFiltering() {
        System.out.println("\nFind Executives : ");
        Stream<Employee> employeeStream = employees.stream()
                .filter(Employee::isExecutive);

        employeeStream.forEach(System.out::println);

    }

    private static void testMultipleFiltering() {
        System.out.println("\nFind Senior Executives from Accounting : ");
        Stream<Employee> empStream = employees.stream()
                .filter(e -> e.getDepartment().equals(Department.ACCOUNTS))
                .filter(Employee::isSenior)
                .filter(Employee::isExecutive);

        empStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        testFiltering();
        testMultipleFiltering();
    }


}
