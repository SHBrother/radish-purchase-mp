package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.OrderExample;
import org.doubleluck.radish_purchase_api.model.po.Order;
import org.doubleluck.radish_purchase_api.repository.OrderMapper;
import org.doubleluck.radish_purchase_api.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public void create(Order order) {
        orderMapper.insertSelective(order);
    }

    @Override
    public void update(Order order) {
        orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public void remove(Long id) {
        Order order = Order.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public Order findById(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Order> findAll() {
        return Optional.ofNullable(orderMapper.selectByExample(new OrderExample())).orElse(Collections.emptyList());
    }
}
