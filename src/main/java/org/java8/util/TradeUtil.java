package org.java8.util;

import org.java8.datamodel.trade.Status;
import org.java8.datamodel.trade.Trade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 4/10/2016.
 */
public class TradeUtil {

    public static List<Trade> createTrades() {
        List<Trade> trades = new ArrayList<>();
        trades.add(new Trade("GOOG", 6000, Status.CANCELED));
        trades.add(new Trade("APPLE", 1000, Status.PENDING));
        trades.add(new Trade("AMAZON", 2450, Status.OPEN));
        trades.add(new Trade("IBM", 100, Status.CLOSED));
        trades.add(new Trade("MICROSOFT", 1500, Status.CANCELED));
        trades.add(new Trade("BMW", 10000, Status.OPEN));
        return trades;
    }

}
