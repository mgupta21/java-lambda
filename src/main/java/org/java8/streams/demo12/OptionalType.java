package org.java8.streams.demo12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Mayank on 4/13/2016.
 */
public class OptionalType {

    private static void attendeesOptional() {
        List<Integer> attendees = Arrays.asList(12, 22, 4, 53);
        Optional<Integer> attendeesSum = attendees.stream().reduce(Integer::sum);
        attendeesSum.ifPresent(System.out::println);
    }

    private static void noAttendeesOptional() {
        List<Integer> attendees = Arrays.asList();
        Optional<Integer> attendeesSum = attendees.stream().reduce(Integer::sum);
        attendeesSum.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        attendeesOptional();
        noAttendeesOptional();
    }

}
