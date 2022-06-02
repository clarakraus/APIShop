package com.example.apishop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> orders;

    public List<Order> listOrders(){
        return orders.values()
                .stream()
                .toList();
    }
    public void addOrder(Order order){
        orders.put(order.getOrderID(), order);
    }

    public Order getOrder(String id) {
       return orders.get(id);
    }
}
