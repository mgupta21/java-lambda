package org.java8.streams.demo13;

import org.java8.datamodel.person.Person;

import java.util.Optional;

/**
 * Created by Mayank on 4/13/2016.
 */
public class OptionalType {

    private static Person person = new Person("John", "Doe");
    private static Person personNull = null;
    private static Person defaultPerson = new Person("firstName", "lastName");

    private static void creatingOptionals() {

        Optional<Person> personOptional = Optional.of(person);
        // System.out.println("Person 1 : " + personOptional.get());
        personOptional.ifPresent(System.out::println);

        Optional<Person> personNullable = Optional.ofNullable(personNull);
        // System.out.println("Person 2 : " + personNullable);
        personNullable.ifPresent(System.out::println);

    }

    private static void ifElseOptionals() {
        Optional<Person> personNullable = Optional.ofNullable(personNull);
        String name = personNullable.orElse(defaultPerson).getFirstName();
        System.out.println("First Name : " + name);
    }

    private static void ifElseThrowOptionals() throws Exception {
        Optional<Person> personNullable = Optional.ofNullable(personNull);
        personNullable.orElseThrow(Exception::new);
    }

    private static void filterMapOptionals() {
        Optional<Person> personOptional = Optional.of(person);
        personOptional.filter(Person::hasAge).ifPresent(System.out::println);
        personOptional.map(Person::getLastName).ifPresent(System.out::println);

    }

    public static void main(String[] args) throws Exception {
        creatingOptionals();
        ifElseOptionals();
        // ifElseThrowOptionals();
        filterMapOptionals();
    }

}
