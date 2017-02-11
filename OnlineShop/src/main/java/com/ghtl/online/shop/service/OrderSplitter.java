package com.ghtl.online.shop.service;

import com.ghtl.online.shop.domain.Order;
import com.ghtl.online.shop.domain.OrderItem;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

import java.util.List;

/**
 * Created by GHTL on 09/02/2017.
 */
public class OrderSplitter extends AbstractMessageSplitter {
    @Override
    protected Object splitMessage(Message message) {
        List<OrderItem> items = ((Order)message.getPayload()).getOrderItems();

        System.out.println("Returning " + items);
        return items;
    }
}
