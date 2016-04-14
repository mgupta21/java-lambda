package org.java8.streams.demo20;

import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mayank on 4/14/2016.
 */
public class ParallelExecution {

    private static List<Trade> trades = TradeUtil.createTrades();

    private static void parallelStream() {

        // Peek statements are used for debugging
        Optional<Integer> sumOfTradesStream = trades.stream()
                .parallel()
                .filter(Trade::isBigTrade)
                .peek(t -> System.out.println("FILTER ->> Thread Name : " + Thread.currentThread().getName()))
                .map(Trade::getQuantity)
                .peek(t -> System.out.println("MAP ->> Thread Name : " + Thread.currentThread().getName()))
                .reduce(Integer::sum);

        System.out.println("Sum of Big Trades : " + sumOfTradesStream.get());
    }

    public static void main(String[] args) {
        parallelStream();
    }
}
