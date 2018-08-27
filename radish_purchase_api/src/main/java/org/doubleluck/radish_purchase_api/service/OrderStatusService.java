package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.OrderStatus;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderStatusService {

    @Transactional
    void create(OrderStatus orderStatus);

    @Transactional
    void update(OrderStatus orderStatus);

    @Transactional
    void remove(Long id);

    OrderStatus findById(Long id);

    List<OrderStatus> findAll();

}