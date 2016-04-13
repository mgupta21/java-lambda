package org.java8.streams.demo10;

import org.java8.datamodel.trade.Status;
import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mayank on 4/12/2016.
 */
public class Finders {

    private static List<Trade> trades = TradeUtil.createTrades();

    private static void testFindFirst() {
        // Optional acts as a safe guard from NullPointers as there could be no big trade
        Optional<Trade> firstTrade = trades.stream()
                .filter(Trade::isBigTrade)
                .findFirst();

        System.out.println("\nFirst Big Trade : " + firstTrade.get());
    }

    private static void testFindAny() {
        Optional<Trade> anyTrade = trades.stream()
                .filter(Trade::isBigTrade)
                .findAny();

        System.out.println("\nAny Big Trade : " + anyTrade.get());
    }

    private static void testAnyMatch() {
        boolean anyMatch = trades.stream()
                .filter(Trade::isBigTrade)
                .anyMatch(t -> t.getStatus().equals(Status.CANCELED));

        System.out.println("\nAny Trade Canceled ? : " + anyMatch);
    }

    private static void testAllMatch() {
        boolean allMatch = trades.stream()
                .filter(Trade::isBigTrade)
                .allMatch(t -> t.getStatus().equals(Status.CANCELED));

        System.out.println("\nAll Trades Canceled ? : " + allMatch);
    }

    private static void testNoneMatch() {
        boolean noneMatch = trades.stream()
                .filter(Trade::isBigTrade)
                .noneMatch(Trade::isBigTrade);

        System.out.println("\nNone of Trades is Big ? : " + noneMatch);
    }

    public static void main(String[] args) {
        testFindFirst();
        testFindAny();
        testAnyMatch();
        testAllMatch();
        testNoneMatch();
    }

}
