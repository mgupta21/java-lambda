package org.java8.util;

import org.java8.datamodel.Apple.Apple;
import org.java8.datamodel.Apple.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 4/14/2016.
 */
public class AppleUtil {

    public static List<Apple> createApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(Color.GREEN, 65));
        apples.add(new Apple(Color.YELLOW, 239));
        apples.add(new Apple(Color.YELLOW, 124));
        apples.add(new Apple(Color.RED, 86));
        apples.add(new Apple(Color.GREEN, 150));
        apples.add(new Apple(Color.RED, 225));
        apples.add(new Apple(Color.GREEN, 123));
        return apples;
    }
}
