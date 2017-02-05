package com.ghtl.shop.checkout

import org.junit.Before
import org.junit.Test

/**
 * Created by GHTL on 05/02/2017.
 */
class ShopManagerTest {
    private def shopManager;

    @Before
    public void setUp() {
        shopManager = new ShopManager()
    }

    @Test
    public void 'if no item is added total cost of basket is 0'() {
        Basket basket = new Basket()
        assert 0.00 == shopManager.checkout(basket)
    }

    @Test
    public void 'total cost is calculated for basket with one item'() {
        Basket basket = new Basket()
        basket.addItem(new Item("banana", 1, 1.5))
        assert 1.5 == shopManager.checkout(basket)
    }
}
