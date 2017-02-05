package com.ghtl.shop.checkout

/**
 * Created by GHTL on 05/02/2017.
 *
   Stub for Item Data
 */
enum ItemTestData {
    Bananas("Bananas", 1.5),
    Oranges("Oranges" , 2.2),
    Apples ("Apples", 3.4),
    Lemons ("Lemons", 0.45),
    Peaches ("Peaches", 1.6)

    String name
    double price

    ItemTestData(String name, double price) {
        this.name = name
        this.price = price
    }
}

