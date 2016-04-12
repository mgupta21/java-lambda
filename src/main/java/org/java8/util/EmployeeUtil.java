package org.java8.util;

import org.java8.datamodel.employee.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 4/11/2016.
 */
public class EmployeeUtil {


    // private Map<String, Employee> employeeMap = createEmployees().stream().collect(Collectors.toMap(createEmployees()))

    private static void initialize() {
        // emploe
    }

    public static List<Employee> createEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E568896", 3));
        employees.add(new Employee("A539789", 5));
        employees.add(new Employee("H297992", 2));
        return employees;
    }

}
