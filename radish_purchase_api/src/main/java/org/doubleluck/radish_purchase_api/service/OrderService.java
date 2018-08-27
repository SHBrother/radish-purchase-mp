package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderService {

    @Transactional
    void create(Order order);

    @Transactional
    void update(Order order);

    @Transactional
    void remove(Long id);

    Order findById(Long id);

    List<Order> findAll();

}