package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.OrderOperationLog;
import org.doubleluck.radish_purchase_api.repository.OrderOperationLogMapper;
import org.doubleluck.radish_purchase_api.service.OrderOperationLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class OrderOperationLogServiceImpl implements OrderOperationLogService {

    @Resource
    private OrderOperationLogMapper orderOperationLogMapper;

    @Override
    public void create(OrderOperationLog orderOperationLog) {

    }

    @Override
    public void update(OrderOperationLog orderOperationLog) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public OrderOperationLog findById(Long id) {
        return null;
    }

    @Override
    public List<OrderOperationLog> findAll() {
        return null;
    }
}
