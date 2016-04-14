package org.java8.streams.demo16;

import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by Mayank on 4/13/2016.
 */
public class CustomCollectors {

    private static List<Trade> trades = TradeUtil.createTrades();

    private static void collectIntoCustomCollector() {

        Supplier<StringBuilder> supplier = StringBuilder::new;
        BiConsumer<StringBuilder, Trade> accumulator = (sb, trade) -> sb.append(trade.getName()).append(",");
        BiConsumer<StringBuilder, StringBuilder> combiner = (sb1, sb2) -> sb1.append(sb2.toString());

        StringBuilder results = trades.stream().collect(supplier, accumulator, combiner);
        System.out.println(results);

    }

    private static void stats() {
        IntSummaryStatistics statistics = trades.stream().collect(Collectors.summarizingInt(Trade::getQuantity));
        System.out.println(statistics);
    }

    public static void main(String[] args) {
        collectIntoCustomCollector();
        stats();
    }

}
