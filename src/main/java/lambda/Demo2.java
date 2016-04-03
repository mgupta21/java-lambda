package lambda;

import java.util.concurrent.Callable;

/**
 * Created by Mayank on 4/3/2016.
 */
public class Demo2 {

    // If an functional interface has only one method, then it can be used as lambda expression. Example : Runnable, Callable etc.

    public void methodAcceptingRunnable(Runnable r) {
        r.run();
    }

    public void methodAcceptingCallable(Callable c) throws Exception {
        System.out.println(c.call());
    }

    public static void main(String[] args) throws Exception {

        // Assign lambda expression to an instance of runnable.
        // run() method of interface Runnable doesn't take argument {represented by () below} or return a object
        Runnable runnable = () -> System.out.println("Hello, lambda");
        new Demo2().methodAcceptingRunnable(runnable);

        new Demo2().methodAcceptingRunnable(() -> {
            System.out.println("Inline lambda");
        });

        // Callable method has sinlge method call that returns an object, in this case String is returned
        Callable callable = () -> "Hello, Callable";
        new Demo2().methodAcceptingCallable(callable);
        new Demo2().methodAcceptingCallable(() -> {
            return "Inline Callable";
        });

    }

}
