package com.ghtl.shop.checkout

/**
 * Created by GHTL on 05/02/2017.
 *
   Stub for Item Data
 */
enum ItemTestData {
    Bananas("Bananas", 1.00),
    Oranges("Oranges" , 2.20),
    Apples ("Apples", 3.40),
    Lemons ("Lemons", 0.45),
    Peaches ("Peaches", 1.60)

    private final String name
    private double price

    ItemTestData(String name, double price) {
        this.name = name
        this.price = price
    }
}

