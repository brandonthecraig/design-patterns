package com.coffeepoweredcrew.strategy;

import java.util.Collection;
import java.util.Iterator;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter{


    @Override
    public void print(Collection<Order> orders) {
        System.out.println("************ Summary Report **************");
        Iterator<Order> iterable = orders.iterator();
        double total = 0;
        for (int i = 1; iterable.hasNext(); i++) {
            Order order = iterable.next();
            System.out.println(i +
                    ". " + order.getId() +
                    "\t" + order.getDate() +
                    "\t" + order.getItems().size() +
                    "\t" + order.getTotal()
                    );
            total += order.getTotal();
        }

        System.out.println("****************");
        System.out.println("total = " + total);
    }
}
