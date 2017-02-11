package com.ghtl.online.shop.domain;

/**
 * Created by GHTL on 09/02/2017.
 */
public class OrderItem {
    private float discountedPrice;
    private int quantity;

    public OrderItem(float discountedPrice, int quantity) {
        this.discountedPrice = discountedPrice;
        this.quantity = quantity;
    }

    public float getDiscountedPrice() {
        return discountedPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "discountedPrice=" + discountedPrice +
                ", quantity=" + quantity +
                '}';
    }
}
