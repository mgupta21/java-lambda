package org.java8.interfaces.demo6;

import org.java8.datamodel.trade.Status;
import org.java8.datamodel.trade.Trade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Mayank on 4/10/2016.
 */

// Test predicates
public class Demo6 {

    public static void main(String[] args) {

        Predicate<Trade> openTrade = t -> t.isOpen();
        Predicate<Trade> canceledTrade = t -> t.checkStatus(Status.CANCELED);
        Predicate<Trade> bigTrade = t -> t.isBigTrade();

        // Predicate derived from other predicate
        /* Logical AND and OR */
        Predicate<Trade> openOrCanceledTrade = openTrade.or(canceledTrade);
        Predicate<Trade> canceledAndBigTrade = canceledTrade.and(bigTrade);

        /* NEGATE */
        Predicate<Trade> notOpenTrade = openTrade.negate();

        /* EQUALS */
        Trade googTrade = new Trade("GOOG", 6000, Status.CANCELED);
        Predicate<Trade> tradeEqual = Predicate.isEqual(googTrade);

        List<Trade> trades = new ArrayList<>();
        trades.add(googTrade);
        trades.add(new Trade("APPLE", 100, Status.OPEN));

        trades.forEach(t -> {
            System.out.println("\n" + t.toString());
            System.out.println("Is open or canceled trade ? : " + openOrCanceledTrade.test(t));
            System.out.println("Is big trade and canceled ? : " + canceledAndBigTrade.test(t));
            System.out.println("Not an open trade ? : " + notOpenTrade.test(t));
            System.out.println("Is Equal Trade ? : " + tradeEqual.test(t));
        });

    }
}
