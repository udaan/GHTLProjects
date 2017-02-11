package com.ghtl.online.shop.service;

import com.ghtl.online.shop.domain.Order;
import org.springframework.integration.annotation.Gateway;

/**
 * Created by GHTL on 09/02/2017.
 *
 * For the gateway the application developer provides only an interface,
 * its implementation is provided by Spring.
 */
public interface Shop {
    //replayChannel - channel from which reply messages will be received
    //requestChannel - channel to which messages will be sent
    //channel - virtual pipe
    @Gateway(requestChannel="orderValidatorChannel")
    void placeOrder(Order order);
}
