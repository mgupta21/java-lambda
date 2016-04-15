package org.java8.interfaces.demo6;

import org.java8.datamodel.Apple.Apple;
import org.java8.datamodel.Apple.Color;
import org.java8.util.AppleUtil;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Mayank on 4/14/2016.
 */
public class PredicatePractice {

    private static List<Apple> apples = AppleUtil.createApples();
    private static Predicate<Apple> greenAppleLambda = a -> a.getColor().equals(Color.GREEN);

    public static void main(String[] args) {

        System.out.println("\nGreen Apples :: ");
        apples.stream().filter(greenAppleLambda).forEach(System.out::println);

        apples.sort((a, b) -> Integer.compare(a.getWeight(), b.getWeight()));
        System.out.println("\nSorted Apples ::");
        apples.forEach(System.out::println);

    }

}
