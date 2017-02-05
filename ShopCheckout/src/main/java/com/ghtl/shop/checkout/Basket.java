package com.ghtl.shop.checkout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GHTL on 05/02/2017.
 */
public class Basket {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
