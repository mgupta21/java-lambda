package org.mgupta.streams;

import java.util.Random;

/**
 * Created by mgupta on 4/2/16.
 */
public class Demo1 {

    public static void main(String[] args) {

        Demo1 demo = new Demo1();

        String[] names = {"Mayank", "Karan", "", "Sahil", ""};

        int count = 10;
        while (count-- > 0) {
            Random random = new Random();
            int x = random.nextInt(5);
            demo.testGreeting(names[x], a -> !a.isEmpty() ? "Howdy " + a + "!" : "Did you forget something?");
        }
    }

    public void testGreeting(String str, Greeting g) {
        System.out.println("Greeting : " + g.sayHello(str));
    }

    interface Greeting {
        String sayHello(String str);
    }
}
