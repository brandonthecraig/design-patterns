package com.coffeepoweredcrew.templatemethod;

import java.util.Map;

//Concrete implementation. Implements steps needed..
//..by template method
public class TextPrinter extends OrderPrinter{


    @Override
    protected String start() {
        return "Order Details";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order #" + order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder builder = new StringBuilder("Items\n-------------\n");

        order.getItems().forEach((key, value) -> builder.append(key + " $" + value + "\n"));

        return builder.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "Total: $" + order.getTotal();
    }

    @Override
    protected String end() {
        return "";
    }
}
