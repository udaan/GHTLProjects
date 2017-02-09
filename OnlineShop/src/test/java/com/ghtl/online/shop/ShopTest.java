package com.ghtl.online.shop;

import com.ghtl.online.shop.domain.Order;
import com.ghtl.online.shop.domain.OrderType;
import com.ghtl.online.shop.service.Shop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

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
        shop.placeOrder(new Order(123, 1, OrderType.MP3));
    }
}
