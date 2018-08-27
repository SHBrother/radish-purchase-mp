package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.OrderDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderDetailService {

    @Transactional
    void create(OrderDetail orderDetail);

    @Transactional
    void update(OrderDetail orderDetail);

    @Transactional
    void remove(Long id);

    OrderDetail findById(Long id);

    List<OrderDetail> findAll();

}