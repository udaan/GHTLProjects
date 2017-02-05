package com.ghtl.shop.checkout

/**
 * Created by GHTL on 05/02/2017.
 */
class PriceSourceStub implements PriceSource {
    @Override
    double getPrice(String name) {
        ItemTestData.valueOf(name).price
    }
}
