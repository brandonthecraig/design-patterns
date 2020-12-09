package com.coffeepoweredcrew.state;

public class Client {

    public static void main(String[] args) {

        Order order = new Order();
        order.cancel();

        order.paymentSuccessful();
        order.cancel();

        order.delivered();
        order.cancel();

        order.dispatched();
        order.cancel();
        
    }
}
