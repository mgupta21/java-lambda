package org.java8.datamodel.person;

/**
 * Created by Mayank on 2/6/2016.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String fullName) {
        String[] split = fullName.split(" ");
        this.firstName = split[0];
        this.lastName = split[1];
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
