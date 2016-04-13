package org.java8.streams.demo5;

import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Created by Mayank on 4/12/2016.
 */
public class PrimitiveStreams {

    private static List<Trade> trades = TradeUtil.createTrades();

    private static void tradeQuantity() {
        Optional<Integer> quantity = trades.stream().map(Trade::getQuantity).reduce(Integer::sum);

        // Prevents cost of boxing to Integer
        IntStream intStream = trades.stream().mapToInt(Trade::getQuantity);

        System.out.println("Quantity : " + quantity.get());
        System.out.println("Quantity from Intstream : " + intStream.sum());
    }

    private static void intStream() {
        int[] ints = new int[]{2, 4, 6, 8, 10};
        IntStream intStream = IntStream.of(ints);

        IntStream intStream1 = IntStream.of(2, 4, 6, 8, 10);

        intStream.forEach(System.out::println);
        intStream1.forEach(System.out::println);
    }

    public static void main(String[] args) {
        tradeQuantity();
        intStream();
    }

}
