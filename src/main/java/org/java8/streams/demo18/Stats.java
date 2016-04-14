package org.java8.streams.demo18;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by Mayank on 4/13/2016.
 */
public class Stats {

    private static IntStream streamOfInts;


    private static void testRange() {
        streamOfInts = getRange();
        streamOfInts.forEach(System.out::println);
    }

    private static void testMaxAndMin() {
        streamOfInts = getClosedRange();
        OptionalInt max = streamOfInts.max();
        System.out.println("Max : " + max.getAsInt());

        streamOfInts = getClosedRange();
        OptionalInt min = streamOfInts.min();
        System.out.println("Min : " + min.getAsInt());

        streamOfInts = getClosedRange();
        OptionalDouble avg = streamOfInts.average();
        System.out.println("Average : " + avg.getAsDouble());
    }

    public static void main(String[] args) {
        testRange();
        testMaxAndMin();
    }

    private static IntStream getRange() {
        return IntStream.range(1, 100);
    }

    private static IntStream getClosedRange() { // Includes border value
        return IntStream.rangeClosed(10, 20);
    }
}
