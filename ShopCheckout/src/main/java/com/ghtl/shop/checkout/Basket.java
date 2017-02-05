package com.ghtl.shop.checkout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GHTL on 05/02/2017.
 */
public class Basket {
    private String id;
    private List<Item> items = new ArrayList<>();

    public Basket(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
