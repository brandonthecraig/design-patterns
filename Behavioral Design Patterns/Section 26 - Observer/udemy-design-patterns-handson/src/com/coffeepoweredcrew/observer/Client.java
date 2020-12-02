package com.coffeepoweredcrew.observer;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("hamburgers");

        PriceObserver price = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(price);
        order.attach(quantityObserver);

        order.addItem(50);
        System.out.println(order);

        order.addItem(300);
        System.out.println(order);

    }
}
