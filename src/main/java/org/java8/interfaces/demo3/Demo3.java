package org.java8.interfaces.demo3;

/**
 * Created by Mayank on 4/10/2016.
 */
// Multiple Inheritance

interface Engine {
    default String model() {
        return "DEFAULT ENGINE";
    }
}

interface Vehicle {
    default String model() { // Duplicate method as in Engine
        return "DEFAULT VEHICLE";
    }
}

class Car implements Vehicle, Engine {
    public String model() { // If model is not defined here compiler contains
        // return "DEFAULT CAR";
        return Engine.super.model();
    }
}

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(new Car().model());
    }
}

/*
Notes : Abstract VS Interface Strategy

1) Abstract
- common functionality
- related class groups
- inherit state and behaviour

2) Interface
- multiple types
- logic from many interfaces
- inherit behaviour

*/