package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.OrderDetailExample;
import org.doubleluck.radish_purchase_api.model.po.OrderDetail;
import org.doubleluck.radish_purchase_api.repository.OrderDetailMapper;
import org.doubleluck.radish_purchase_api.service.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class OrderDetailServiceImpl implements OrderDetailService {

    @Resource
    private OrderDetailMapper orderDetailMapper;

    @Override
    public void create(OrderDetail orderDetail) {
        orderDetailMapper.insertSelective(orderDetail);
    }

    @Override
    public void update(OrderDetail orderDetail) {
        orderDetailMapper.updateByPrimaryKeySelective(orderDetail);
    }

    @Override
    public void remove(Long id) {
        OrderDetail orderDetail = OrderDetail.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        orderDetailMapper.updateByPrimaryKeySelective(orderDetail);
    }

    @Override
    public OrderDetail findById(Long id) {
        return orderDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OrderDetail> findAll() {
        return Optional.ofNullable(orderDetailMapper.selectByExample(new OrderDetailExample())).orElse(Collections.emptyList());
    }
}
