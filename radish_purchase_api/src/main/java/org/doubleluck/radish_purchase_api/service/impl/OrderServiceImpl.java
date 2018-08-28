package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.exception.ServiceException;
import org.doubleluck.radish_purchase_api.model.example.OrderExample;
import org.doubleluck.radish_purchase_api.model.po.Order;
import org.doubleluck.radish_purchase_api.repository.OrderMapper;
import org.doubleluck.radish_purchase_api.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
        try {
            // 只是一个例子，演示受检异常的处理
            FileInputStream fileInputStream = new FileInputStream(new File("abc"));
        } catch (IOException e) {
            log.error("the reason", e);
            throw new ServiceException(e.getMessage());
        }
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
