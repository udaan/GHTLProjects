package com.ghtl.online.shop.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GHTL on 09/02/2017.
 */
public class Order {
    private int orderId;
    private OrderType orderType;
    private List<OrderItem> orderItems;

    public Order(int orderId, OrderType orderType, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.orderType = orderType;
        this.orderItems = orderItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }



    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderType=" + orderType +
                ", orderItems=" + orderItems +
                '}';
    }
}