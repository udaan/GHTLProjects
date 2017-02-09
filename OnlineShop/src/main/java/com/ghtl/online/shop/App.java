package com.ghtl.online.shop;

import com.ghtl.online.shop.domain.Order;
import com.ghtl.online.shop.domain.OrderType;
import com.ghtl.online.shop.service.Shop;
import com.ghtl.online.shop.service.ShopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GHTL on 09/02/2017.
 */
public class App {
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext( "/META-INF/com/ghtl/online/shop/shop.xml", ShopService.class );

        Shop shopService = applicationContext.getBean( "shop", Shop.class );

        shopService.placeOrder(new Order(1, 2, OrderType.EBOOK));
//        shopService.placeOrder(null);
    }
}
