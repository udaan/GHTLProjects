package com.ghtl.shop.checkout;

/**
 * Created by GHTL on 05/02/2017.
 */
public interface Invoicable {
    Basket createInvoice();
    double checkout(Basket basket);
}
