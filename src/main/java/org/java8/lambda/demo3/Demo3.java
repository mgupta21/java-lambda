package org.java8.lambda.demo3;

import org.java8.lambda.Trade;

/**
 * Created by Mayank on 4/3/2016.
 */
public class Demo3 {

    public static void main(String[] args) {

        // Step 2 : Define lambda expressions or body of interface method
        Tradable<Trade> bigTradeLambda = (trade) -> trade.isBigTrade();  // <argument> -> <Body>
        Tradable<Trade> cmeTradeLambda = (trade) -> trade.getName().equals("CME");

        Trade t1 = new Trade("GOOGLE", 5000);
        Trade t2 = new Trade("CME");

        System.out.println("Trade Name : " + t1.getName());
        // Step 3 : Call pre-defined lambda expressions on object
        System.out.println("Is CME ? " + cmeTradeLambda.check(t1));
        System.out.println("Is Big Trade ? " + bigTradeLambda.check(t1));

        // Step 3B : Call lambda expressions on object via a method
        System.out.println("Trade Name : " + t2.getName());
        System.out.println("Is CME ? " + methodAcceptingTradable(t2, cmeTradeLambda));
        System.out.println("Is Big Trade ? " + methodAcceptingTradable(t2, bigTradeLambda));

    }

    // Step 1 : Define Interface with single method
    interface Tradable<Trade> {
        boolean check(Trade t); // The lambda expression should pass an argument and return boolean
    }

    public static boolean methodAcceptingTradable(Trade trade, Tradable tradable) {
        return tradable.check(trade);
    }

}