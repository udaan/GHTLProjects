package com.ghtl.online.shop;

import com.ghtl.online.shop.domain.Order;
import com.ghtl.online.shop.domain.OrderItem;
import com.ghtl.online.shop.domain.OrderType;
import com.ghtl.online.shop.service.Shop;
import com.ghtl.online.shop.service.ShopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GHTL on 09/02/2017.
 */
public class App {
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext( "/META-INF/com/ghtl/online/shop/shop.xml", ShopService.class );

        Shop shopService = applicationContext.getBean( "shop", Shop.class );
        Order order = createOrder();

        shopService.placeOrder(order);
//        shopService.placeOrder(null);
    }

    private static Order createOrder() {
        OrderItem orderItem = new OrderItem(1.2f, 2);
        List<OrderItem> items = new ArrayList<OrderItem>();
        items.add(orderItem);
        return new Order(1, OrderType.EBOOK, items);
    }
}
