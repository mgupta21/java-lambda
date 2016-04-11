package org.java8.interfaces.demo9;

import org.java8.datamodel.movie.Movie;
import org.java8.datamodel.trade.Trade;
import org.java8.util.TradeUtil;

import java.util.List;
import java.util.function.Function;

/**
 * Created by Mayank on 4/11/2016.
 */
// Function : used for mapping, transformation or finding something
public class FunctionFunctionalInterface {

    /*@FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
        // other default and static methods
    }*/

    public static Movie testFunctionInterface(String name) {
        Function<String, Movie> createMovieFunction = n -> new Movie(n);
        return createMovieFunction.apply(name);
    }

    public static Trade testFunctionInterface(String name, List<Trade> trades) {
        Function<String, Trade> tradeFinderFunction = n -> trades.stream().filter(t -> t.getName() == name).findFirst().get();
        return tradeFinderFunction.apply(name);
    }

    public static void main(String[] args) {

        List<Trade> trades = TradeUtil.createTrades();

        System.out.println(testFunctionInterface("TITANIC").toString());
        System.out.println(testFunctionInterface("APPLE", trades));

    }
}
