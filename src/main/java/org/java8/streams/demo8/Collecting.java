package org.java8.streams.demo8;

import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Mayank on 4/12/2016.
 */
// Collector is an inteface and Collectors is a utility
public class Collecting {

    private static List<Trade> trades = TradeUtil.createTrades();

    private static void collectToList() {
        List<Trade> tradeList = trades.stream()
                .collect(Collectors.toList());
        System.out.println(tradeList);
    }

    private static void collectToSet() {
        Set<Trade> tradeSet = trades.stream()
                .collect(Collectors.toSet());
        System.out.println(tradeSet);

    }

    private static void collectToMap() {
        Map<String, Trade> tradeMap = trades.stream()
                .collect(Collectors.toMap(Trade::getName, trade -> trade));
        System.out.println(tradeMap);
    }

    public static void main(String[] args) {
        collectToList();
        collectToSet();
        collectToMap();
    }

}
