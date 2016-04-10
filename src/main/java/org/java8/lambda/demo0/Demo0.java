package org.java8.lambda.demo0;

/**
 * Created by Mayank on 4/10/2016.
 */
public class Demo0 {

    // Optional annotation. Enforces single method to interface so it can be used for lambda expression
    @FunctionalInterface
    interface Multiplier {
        int multiply(int a, int b);
    }

    Multiplier MultiplierLambda = (a, b) -> a * b;

    // Type is optional and is inferred from the interface
    //Multiplier MultiplierLambda2 = (int a , int b) -> a*b;

    public static void main(String[] args) {
        System.out.println(new Demo0().MultiplierLambda.multiply(3, 4));
    }

}
