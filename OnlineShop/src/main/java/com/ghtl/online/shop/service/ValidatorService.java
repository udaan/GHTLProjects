package com.ghtl.online.shop.service;

import com.ghtl.online.shop.domain.Order;
import org.springframework.stereotype.Service;

/**
 * Created by GHTL on 09/02/2017.
 */
@Service
public class ValidatorService implements Validable {

    /*
    if void then no need of any output or reply chanel
     */
    @Override
    public void validate(Order order) throws InvalidMessageException {

        if (order == null) {
            throw new InvalidMessageException("Order is empty or null");
        }
        System.out.println("Valid order is received " + order);
    }
}
