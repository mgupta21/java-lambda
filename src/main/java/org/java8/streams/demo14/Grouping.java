package org.java8.streams.demo14;

import org.java8.datamodel.employee.Department;
import org.java8.datamodel.employee.Employee;
import org.java8.datamodel.employee.Level;
import org.java8.util.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Mayank on 4/13/2016.
 */
public class Grouping {

    private static List<Employee> employees = EmployeeUtil.createEmployees();

    private static Map<Department, List<Employee>> groupingByDepartment() {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }

    private static Map<Level, List<Employee>> groupingByLevel() {
        return employees.stream().collect(Collectors.groupingBy(Employee::getLevel));
    }

    private static Map<Department, Map<Level, List<Employee>>> groupingByDepartmentAndLevel() {
        return employees.stream().collect(Collectors.groupingBy((Employee::getDepartment), Collectors.groupingBy(Employee::getLevel)));
    }

    public static void main(String[] args) {
        System.out.println(groupingByDepartment());
        System.out.println(groupingByLevel());
        System.out.println(groupingByDepartmentAndLevel());
    }

}
