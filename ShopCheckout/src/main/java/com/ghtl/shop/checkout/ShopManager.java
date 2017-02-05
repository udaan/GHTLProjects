package com.ghtl.shop.checkout;

import java.util.UUID;

/**
 * Created by GHTL on 05/02/2017.
 */
public class ShopManager implements Invoicable {

    private PriceSource priceSource;

    public ShopManager(PriceSource priceSource) {
        this.priceSource = priceSource;
    }

    @Override
    public Basket createInvoice() {
        return new Basket(UUID.randomUUID().toString());
    }

    public void addEnrichedItem(Basket basket, String name, double weight) {
        // Find price
        basket.addItem(new Item(name, weight, priceSource.getPrice(name)));
    }

    /*
    takes a basket of items and outputs its total cost.
     */
    @Override
    public double checkout(Basket basket) {
        double total = 0;
        if(basket != null) {
            for (Item item : basket.getItems()) {
                total += item.getPrice() * item.getWeight();
            }
        }
        return total;
    }
}
