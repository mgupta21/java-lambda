package org.java8.streams.demo11;

import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Mayank on 4/12/2016.
 */
public class Reducing {

    private static List<Trade> trades = TradeUtil.createTrades();

    private static void tradeNamesList() {
        Optional<String> reducedTradeNamesList = trades.stream()
                .map(Trade::getName)
                .reduce((a, b) -> a + ", " + b);

        System.out.println("\nComma Separated Trade Names :\n" + reducedTradeNamesList.get());
    }

    private static void tradeQuantitySum() {
        Optional<Integer> reducedTradeQuantity = trades.stream()
                .map(Trade::getQuantity)
                .reduce((a, b) -> a + b);

        System.out.println("\nTotal Trade Quantity :\n" + reducedTradeQuantity.get());
    }

    private static void arraysSum() {
        List<Integer> ints = Arrays.asList(11, 12, 13, 14);

        Optional<Integer> reducedOptionalSum = ints.stream().reduce((i, j) -> i + j);
        // When we provide initial value, then possibility of null pointer disappears
        int reducedSum = ints.stream().reduce(10, (i, j) -> i + j);

        System.out.println("\nSum of arrays 1 : " + reducedOptionalSum.get());
        System.out.println("\nSum of arrays 2 : " + reducedSum);
    }

    public static void main(String[] args) {
        tradeNamesList();
        tradeQuantitySum();
        arraysSum();
    }

}
