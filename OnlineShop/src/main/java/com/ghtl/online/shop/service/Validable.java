package com.ghtl.online.shop.service;

import com.ghtl.online.shop.domain.Order;

/**
 * Created by GHTL on 09/02/2017.
 */
public interface Validable {
    void validate(Order order) throws InvalidMessageException;
}
