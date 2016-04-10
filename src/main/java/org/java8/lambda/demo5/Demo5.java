package org.java8.lambda.demo5;

import org.java8.lambda.Status;
import org.java8.lambda.Trade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 4/3/2016.
 */
// Capturing Lambda
public class Demo5 {
    public static void main(String[] args) {

        List<Trade> trades = new ArrayList<>();
        trades.add(new Trade("Google", 5000));
        trades.add(new Trade("CME", 1000, Status.CLOSED));
        trades.add(new Trade("Apple", 2450, Status.PENDING));

        trades.forEach(t -> {
            System.out.println("****\nTrade Name : " + t.getName()); // We can create another interface that has a method that returns String
            System.out.println("Quantity : " + t.getQuantity()); // We can create another interface that has a method that returns int
            System.out.println("Big Trade ? : " + isBigTrade(t));
            System.out.println("Open Trade ? : " + isOpenTrade(t));
            System.out.println("Trade Pending ? : " + checkStatus(t, Status.PENDING));
            System.out.println();
        });

    }

    public static boolean isOpenTrade(Trade trade) {
        ITrade tradeLambda = t -> t.isOpen();
        return tradeLambda.check(trade);
    }

    public static boolean isBigTrade(Trade trade) {
        ITrade tradeLambda = t -> t.isBigTrade();
        return tradeLambda.check(trade);
    }

    // Lambda behaviour is capture in a method
    public static boolean checkStatus(Trade trade, Status status) {
        // status = Status.OPEN; // Compilation error : variable used in lambda expression should be final or effectively final
        // Note : local variables are treated as immutable in java as they exist on stack memory  as opposed to heap
        // for instance variables hence are treated as thread safe as no other thread can access them other than they itself
        // Although compiler assist in preventing form re-assigning local variables used in lambda expression but in case of
        // instance variable its developer's responsibility to prevent reassigning or mutate instance variables used in lambda expression
        // The reason is the thread that created the lambda expression (that uses modified instance variable) may have been recycled
        // but lambda expression may still be running. Hence the code will not be thread safe.

        // Lambda expression that uses parameter (status) from enclosing scope is called capturing lambda
        ITrade tradeLambda = t -> t.checkStatus(status);
        return tradeLambda.check(trade);
    }

    public interface ITrade {
        boolean check(Trade t);
    }
}
