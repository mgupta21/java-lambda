package org.java8.interfaces.demo8;

import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Mayank on 4/10/2016.
 */
public class SupplierFunctionalInterface {

    /*@FunctionalInterface
    public interface Supplier<T> {
        T get();
    }*/

    public static void main(String[] args) {

        Supplier<String[]> fruitSupplier = () -> new String[]{"Orange", "Mango", "Strawberry"};
        Supplier<List<Trade>> tradeSupplier = () -> TradeUtil.createTrades();

        String[] fruits = fruitSupplier.get();
        List<Trade> trades = tradeSupplier.get();

        System.out.println("\nFruits : ");
        for (String fruit : fruits) {
            System.out.println("Fruit Name : " + fruit);
        }

        System.out.println("\nTrades : ");
        trades.forEach(t -> System.out.println(t.toString()));

    }

}
