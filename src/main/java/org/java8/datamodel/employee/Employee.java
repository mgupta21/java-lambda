package org.java8.datamodel.employee;

/**
 * Created by Mayank on 4/10/2016.
 */
public class Employee {

    String id;
    String name;
    Department department;
    Level level;
    int rating;

    public Employee(String empId, String name, Department department, Level level, int rating) {
        this.id = empId;
        this.name = name;
        this.department = department;
        this.level = level;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isExecutive() {
        return id.toLowerCase().contains("e");
    }

    public boolean isSenior() {
        return level.equals(Level.SENIOR);
    }

    public Level getLevel() {
        return level;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rating=" + rating +
                ", id='" + id + '\'' +
                '}';
    }
}