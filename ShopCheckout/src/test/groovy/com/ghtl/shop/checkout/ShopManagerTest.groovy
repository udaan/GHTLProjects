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
        shopManager = new ShopManager(new PriceSourceStub())
    }

    @Test
    public void 'if no item is added total cost of basket is 0'() {
        Basket basket = shopManager.createInvoice()
        assert 0 == shopManager.checkout(basket)
    }

    @Test
    public void 'total cost is calculated for basket with one item'() {
        Basket basket = shopManager.createInvoice()
        shopManager.addEnrichedItem(basket, ItemTestData.Bananas.name, 1)
        assert 1.5 == shopManager.checkout(basket)
    }

    @Test
    public void 'total cost is calculated for basket with multiple items'() {
        Basket basket = shopManager.createInvoice()
        shopManager.addEnrichedItem(basket, ItemTestData.Bananas.name, 0.5)
        shopManager.addEnrichedItem(basket, ItemTestData.Apples.name, 1.2)
        shopManager.addEnrichedItem(basket, ItemTestData.Peaches.name, 0.25)
        def test_total = (0.5 * ItemTestData.Bananas.price) + (1.2 * ItemTestData.Apples.price) + (0.25 * ItemTestData.Peaches.price)
        assert test_total == shopManager.checkout(basket)
    }
}
