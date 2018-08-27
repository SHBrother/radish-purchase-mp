package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.OrderOperationLog;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderOperationLogService {

    @Transactional
    void create(OrderOperationLog orderOperationLog);

    @Transactional
    void update(OrderOperationLog orderOperationLog);

    @Transactional
    void remove(Long id);

    OrderOperationLog findById(Long id);

    List<OrderOperationLog> findAll();

}