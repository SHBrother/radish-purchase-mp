package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.OrderStatus;
import org.doubleluck.radish_purchase_api.repository.OrderStatusMapper;
import org.doubleluck.radish_purchase_api.service.OrderStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class OrderStatusServiceImpl implements OrderStatusService {

    @Resource
    private OrderStatusMapper orderStatusMapper;

    @Override
    public void create(OrderStatus orderStatus) {

    }

    @Override
    public void update(OrderStatus orderStatus) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public OrderStatus findById(Long id) {
        return null;
    }

    @Override
    public List<OrderStatus> findAll() {
        return null;
    }
}
