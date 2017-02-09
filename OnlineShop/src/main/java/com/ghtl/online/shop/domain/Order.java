package com.ghtl.online.shop.domain;

/**
 * Created by GHTL on 09/02/2017.
 */
public class Order {
    private int orderId;
    private int quantity;
    private OrderType orderType;

    public Order(int orderId, int quantity, OrderType orderType) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.orderType = orderType;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", quantity=" + quantity +
                ", orderType=" + orderType +
                '}';
    }
}