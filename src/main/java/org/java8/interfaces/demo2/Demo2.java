package org.java8.interfaces.demo2;

/**
 * Created by Mayank on 4/10/2016.
 */

interface Engine {
    default String make() {
        return "DEFAULT MAKE";
    }
}

interface Vehicle {
    default String model() {
        return "DEFAULT MODEL";
    }
}

class Car implements Engine, Vehicle {
    String makeAndModel() {
        return Engine.super.make() + " " + Vehicle.super.model();
    }
}

public class Demo2 {

    public static void main(String[] args) {
        System.out.println(new Car().makeAndModel());
    }

}
