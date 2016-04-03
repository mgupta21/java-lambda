package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 4/3/2016.
 */
// Capturing Lambda
public class Demo5 {
    public static void main(String[] args) {

        List<Trade> trades = new ArrayList<>();
        trades.add(new Trade("Google", 5000));
        trades.add(new Trade("CME", 1000, Status.CLOSED));
        trades.add(new Trade("Apple", 2450, Status.PENDING));

        trades.forEach(t -> {
            System.out.println("****\nTrade Name : " + t.getName());
            System.out.println("Quantity : " + t.getQuantity());
            System.out.println("Big Trade ? : " + isBigTrade(t));
            System.out.println("Open Trade ? : " + isOpenTrade(t));
            System.out.println("Trade Pending ? : " + checkStatus(t, Status.PENDING));
            System.out.println();
        });

    }

    // Lambda behaviour is capture in a method
    public static boolean isBigTrade(Trade trade) {
        ITrade tradeLambda = t -> t.isBigTrade();
        return tradeLambda.check(trade);
    }

    public static boolean isOpenTrade(Trade trade) {
        ITrade tradeLambda = t -> t.isOpen();
        return tradeLambda.check(trade);
    }

    public static boolean checkStatus(Trade trade, Status status) {
        ITrade tradeLambda = t -> t.checkStatus(status);
        return tradeLambda.check(trade);
    }

    public interface ITrade {
        boolean check(Trade t);
    }
}
