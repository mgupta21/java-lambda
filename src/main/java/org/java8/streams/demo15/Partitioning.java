package org.java8.streams.demo15;

import org.java8.datamodel.employee.Department;
import org.java8.datamodel.employee.Employee;
import org.java8.util.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Mayank on 4/13/2016.
 */
public class Partitioning {

    private static List<Employee> employees = EmployeeUtil.createEmployees();

    private static void partitioningByExec() {
        Map<Boolean, List<Employee>> empExecPartition = employees.stream().collect(Collectors.partitioningBy(Employee::isExecutive));
        System.out.println(empExecPartition);
    }

    private static void paritioningAndGrouping() {
        Map<Boolean, Map<Department, List<Employee>>> empPartitionAndGroup = employees.stream().collect(Collectors.partitioningBy((Employee::isExecutive), Collectors.groupingBy(Employee::getDepartment)));
        System.out.println(empPartitionAndGroup);
    }

    private static void paritioningMulti() {
        Map<Boolean, Map<Boolean, List<Employee>>> empMultiPartition = employees.stream().collect(Collectors.partitioningBy((Employee::isExecutive), Collectors.partitioningBy(Employee::isSenior)));
        System.out.println(empMultiPartition);
    }

    public static void main(String[] args) {
        partitioningByExec();
        paritioningAndGrouping();
        paritioningMulti();
    }
}
