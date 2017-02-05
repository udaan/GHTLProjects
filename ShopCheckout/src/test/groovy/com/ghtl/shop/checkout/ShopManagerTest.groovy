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
        assert 0 == shopManager.checkout(basket)
    }

    @Test
    public void 'total cost is calculated for basket with one item'() {
        Basket basket = new Basket()
        basket.addItem(new Item(ItemTestData.Bananas.name, 1, ItemTestData.Bananas.price))
        assert 1.5 == shopManager.checkout(basket)
    }

    @Test
    public void 'total cost is calculated for basket with multiple items'() {
        Basket basket = new Basket()
        basket.addItem(new Item(ItemTestData.Bananas.name, 0.5, ItemTestData.Bananas.price))
        basket.addItem(new Item(ItemTestData.Apples.name, 1.2, ItemTestData.Apples.price))
        basket.addItem(new Item(ItemTestData.Peaches.name, 0.25, ItemTestData.Peaches.price))
        def test_total = (0.5 * ItemTestData.Bananas.price) + (1.2 * ItemTestData.Apples.price) + (0.25 * ItemTestData.Peaches.price)
        assert test_total == shopManager.checkout(basket)
    }
}
