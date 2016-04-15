package org.java8.streams.demo21;

import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by Mayank on 4/14/2016.
 */
public class PerformanceManagement {

    private static List<Trade> trades = TradeUtil.createTrades(999999);

    private static void sumTradesInSerial() {
        System.out.println("\nSerial Execution :: ");
        Instant start = Instant.now();
        System.out.println("Sum : " + trades.stream().map(Trade::getQuantity).reduce(Integer::sum).get());
        Instant end = Instant.now();
        Duration d = Duration.between(start, end);
        System.out.println("Time taken : " + d.toMillis() + " ms");
    }

    private static void sumTradesInParallel() {
        System.out.println("\nParallel Execution :: ");
        Instant start = Instant.now();
        System.out.println("Sum : " + trades.stream().parallel().map(Trade::getQuantity).reduce(Integer::sum).get());
        Instant end = Instant.now();
        Duration d = Duration.between(start, end);
        System.out.println("Time taken : " + d.toMillis() + " ms");
    }

    public static void main(String[] args) {
        System.out.println("\nThreads available on system : " + new ForkJoinPool().getParallelism());
        System.out.println("\nTrades in Test : " + trades.size());
        sumTradesInSerial();
        sumTradesInParallel();
    }
}
