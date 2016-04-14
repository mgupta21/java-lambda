package org.java8.streams.demo19;

import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mayank on 4/14/2016.
 */
public class SerialExecution {

    private static List<Trade> trades = TradeUtil.createTrades();

    private static void serialStream() {

        Optional<Integer> sumOfTradesStream = trades.stream()
                .filter(t -> {
                    System.out.println("FILTER ->> Trade Name : " + t.getName() + " | Thread Name : " + Thread.currentThread().getName());
                    return t.isBigTrade();
                })
                .map(t -> {
                    System.out.println("MAP ->> Trade Name : " + t.getName() + " | Thread Name : " + Thread.currentThread().getName());
                    return t.getQuantity();
                }).reduce(Integer::sum);

        System.out.println("Sum of Big Trades : " + sumOfTradesStream.get());
    }

    public static void main(String[] args) {
        serialStream();
    }

}
