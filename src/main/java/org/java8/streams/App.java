package org.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args ) {

        List<Person> persons = Arrays.asList(new Person("Mayank", 23), new Person("John", 19), new Person("Chris", 15), new Person("Brian", 16));

        persons.forEach(p -> System.out.println(p));
        printLine();

        persons.forEach(p -> p.setLastName("Gupta"));
        persons.forEach(p -> System.out.println(p));
        printLine();

        List<Person> personsOver18 = persons.stream().filter(p -> p.age > 18).collect(Collectors.toList());
        personsOver18.forEach(p -> System.out.println(p));
        printLine();

    }

    public static void printLine() {
        System.out.println("\n=============================================\n");
    }
}
