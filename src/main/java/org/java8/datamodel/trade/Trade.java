package org.java8.datamodel.trade;

/**
 * Created by Mayank on 4/3/2016.
 */
public class Trade {
    private String name;
    private int quantity;
    private Status status;

    public Trade(String name, int quantity, Status status) {
        this.quantity = quantity;
        this.name = name;
        this.status = status;
    }

    public Trade(String name, int quantity) {
        this(name, quantity, Status.OPEN);
    }

    public Trade(String name) {
        this(name, 0);
    }

    public boolean isBigTrade() {
        return quantity >= 2000;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isOpen() {
        return status == Status.OPEN;
    }

    public boolean checkStatus(Status status) {
        return getStatus() == status;
    }

    public Status getStatus() {
        return status;
    }

}