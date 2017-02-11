package com.ghtl.online.shop;

import com.ghtl.online.shop.domain.Order;
import com.ghtl.online.shop.domain.OrderItem;
import com.ghtl.online.shop.domain.OrderType;
import com.ghtl.online.shop.service.Shop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GHTL on 09/02/2017.
 *
 * Our test class is much cleaner now.
 * It does not know about channels, or messages or anything related to Spring Integration at all.
 * It only knows about the class
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ShopTest {
    @Autowired
    private Shop shop;

    @Test
    public void test() {
        shop.placeOrder(createOrder());
    }

    private static Order createOrder() {
        OrderItem orderItem = new OrderItem(1.2f, 2);
        List<OrderItem> items = new ArrayList<OrderItem>();
        items.add(orderItem);
        return new Order(1, OrderType.EBOOK, items);
    }
}
