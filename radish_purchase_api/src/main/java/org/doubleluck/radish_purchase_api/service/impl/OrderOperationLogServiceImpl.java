package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.OrderOperationLogExample;
import org.doubleluck.radish_purchase_api.model.po.OrderOperationLog;
import org.doubleluck.radish_purchase_api.repository.OrderOperationLogMapper;
import org.doubleluck.radish_purchase_api.service.OrderOperationLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class OrderOperationLogServiceImpl implements OrderOperationLogService {

    @Resource
    private OrderOperationLogMapper orderOperationLogMapper;

    @Override
    public void create(OrderOperationLog orderOperationLog) {
        orderOperationLogMapper.insertSelective(orderOperationLog);
    }

    @Override
    public void update(OrderOperationLog orderOperationLog) {
        // TODO
    }

    @Override
    public void remove(Long id) {
        OrderOperationLog orderOperationLog = OrderOperationLog.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        orderOperationLogMapper.updateByPrimaryKeySelective(orderOperationLog);
    }

    @Override
    public OrderOperationLog findById(Long id) {
        return orderOperationLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OrderOperationLog> findAll() {
        return Optional.ofNullable(orderOperationLogMapper.selectByExample(new OrderOperationLogExample())).orElse(Collections.emptyList());
    }
}
