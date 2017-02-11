package com.ghtl.online.shop.service;

import com.ghtl.online.shop.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

/**
 * Created by GHTL on 09/02/2017.
 *
 * The Gateway component represents the entry point to the messaging system.
 * All new Orders will be submitted to this component
 * which will in turn wrap them as messages and
 * place them into the channel appropriately named ordersChannel.
 *
 * A gateway s typically an entry or exit point for the messaging system.
 *
 * not using @service because it is used to invoke local service
 *
 * For gateway we don't need class as spring integration creates proxy for the interface.
 */
public class ShopService implements Shop {

    @Autowired
    private MessageChannel orderValidatorChannel;

    @Override
    public void placeOrder(Order order) {
        System.out.println("Order is received " + order);
        orderValidatorChannel.send(MessageBuilder.withPayload(order).build());
    }
}
