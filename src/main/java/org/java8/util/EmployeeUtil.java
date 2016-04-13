package org.java8.util;

import org.java8.datamodel.employee.Department;
import org.java8.datamodel.employee.Employee;
import org.java8.datamodel.employee.Level;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 4/11/2016.
 */
public class EmployeeUtil {


    // private Map<String, Employee> employeeMap = createEmployees().stream().collect(Collectors.toMap(createEmployees()))

    private static void initialize() {
    }

    public static List<Employee> createEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E568896", "John Doe", Department.ACCOUNTS, Level.INTERMEDIATE, 3));
        employees.add(new Employee("A539789", "Louis Pasteur", Department.TECHNOLOGY, Level.JUNIOR, 5));
        employees.add(new Employee("E839434", "Rosa Parks", Department.ACCOUNTS, Level.SENIOR, 14));
        employees.add(new Employee("H297992", "Oprah Winfrey", Department.MARKETING, Level.SENIOR, 2));
        employees.add(new Employee("E759380", "Peter Sellers", Department.ACCOUNTS, Level.SENIOR, 11));
        employees.add(new Employee("E208334", "Ernest Hemingway", Department.FINANCE, Level.SENIOR, 9));
        return employees;
    }

}
