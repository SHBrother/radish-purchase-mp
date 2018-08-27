package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.OrderDetail;
import org.doubleluck.radish_purchase_api.repository.OrderDetailMapper;
import org.doubleluck.radish_purchase_api.service.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class OrderDetailServiceImpl implements OrderDetailService {

    @Resource
    private OrderDetailMapper orderDetailMapper;

    @Override
    public void create(OrderDetail orderDetail) {

    }

    @Override
    public void update(OrderDetail orderDetail) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public OrderDetail findById(Long id) {
        return null;
    }

    @Override
    public List<OrderDetail> findAll() {
        return null;
    }
}
