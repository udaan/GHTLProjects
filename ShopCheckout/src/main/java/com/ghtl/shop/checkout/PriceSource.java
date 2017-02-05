package com.ghtl.shop.checkout;

/**
 * Created by GHTL on 05/02/2017.
 *
 * To implement reading price from DB etc
 */
public interface PriceSource {
    double getPrice(String name);
}
