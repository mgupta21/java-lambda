package org.java8.streams.demo1;

import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mayank on 4/11/2016.
 */
public class BasicStreams {

    public static List<Trade> getLargeTrades(List<Trade> trades) {
        return trades.stream()    // convert list to sequence
                .filter(t -> t.getQuantity() > 2000)    // filter results
                .collect(Collectors.toList());    // collect results
    }

    public static void listTrades(List<Trade> trades) {
        trades.forEach(t -> System.out.println(t.toString()));
    }

    public static void main(String[] args) {
        listTrades(getLargeTrades(TradeUtil.createTrades()));
    }

}
