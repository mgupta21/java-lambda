package org.java8.streams;

/**
 * Created by Mayank on 4/10/2016.
 */
public class Demo1 {

    public static void main(String[] args) {

        class EmployeeImpl implements Employee {

            @Override
            public Employee find(String id) {
                return null;
            }

            // default method can be overridden but not static methods
            @Override
            public boolean isExec(String id) {
                return false;
            }
        }

        EmployeeImpl emp = new EmployeeImpl();
        System.out.println(emp.isExec("e787093"));
        System.out.println(Employee.getDefaultCountry());

    }
}

interface Employee {
    // abstract method
    Employee find(String id);


    // default method - Java 8 allows concrete implementation
    default boolean isExec(String id) {
        return id.toLowerCase().contains("e");
    }

    // static method - Java 8 allows static methods in interface
    static String getDefaultCountry() {
        return "USA";
    }


}


