package com.ghtl.shop.checkout;

/**
 * Created by GHTL on 05/02/2017.
 */
public class ShopManager implements Invoicable {

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
