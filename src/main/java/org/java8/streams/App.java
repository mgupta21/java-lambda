package org.java8.streams;

import org.java8.datamodel.person.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(new Person("Mayank", "G", 23), new Person("John", "M", 19), new Person("Chris", "L", 15), new Person("Brian", "D", 16));

        persons.forEach(p -> System.out.println(p));
        printLine();

        persons.forEach(p -> p.setLastName("Gupta"));
        persons.forEach(p -> System.out.println(p));
        printLine();

        List<Person> personsOver18 = persons.stream().filter(p -> p.getAge() > 18).collect(Collectors.toList());
        personsOver18.forEach(p -> System.out.println(p));
        printLine();

    }

    public static void printLine() {
        System.out.println("\n=============================================\n");
    }
}
