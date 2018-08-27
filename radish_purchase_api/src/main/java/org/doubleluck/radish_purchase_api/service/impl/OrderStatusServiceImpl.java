package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.OrderStatusExample;
import org.doubleluck.radish_purchase_api.model.po.OrderStatus;
import org.doubleluck.radish_purchase_api.repository.OrderStatusMapper;
import org.doubleluck.radish_purchase_api.service.OrderStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class OrderStatusServiceImpl implements OrderStatusService {

    @Resource
    private OrderStatusMapper orderStatusMapper;

    @Override
    public void create(OrderStatus orderStatus) {
        orderStatusMapper.insertSelective(orderStatus);
    }

    @Override
    public void update(OrderStatus orderStatus) {
        orderStatusMapper.updateByPrimaryKeySelective(orderStatus);
    }

    @Override
    public void remove(Long id) {
        OrderStatus orderStatus = OrderStatus.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        orderStatusMapper.updateByPrimaryKeySelective(orderStatus);
    }

    @Override
    public OrderStatus findById(Long id) {
        return orderStatusMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OrderStatus> findAll() {
        return Optional.ofNullable(orderStatusMapper.selectByExample(new OrderStatusExample())).orElse(Collections.emptyList());
    }
}
