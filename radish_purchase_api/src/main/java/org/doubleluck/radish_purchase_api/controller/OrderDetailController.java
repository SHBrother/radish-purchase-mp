package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.OrderDetail;
import org.doubleluck.radish_purchase_api.service.OrderDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/orderDetail")
public class OrderDetailController {

    @Resource
    private OrderDetailService orderDetailService;

    @PostMapping("")
    public RestApiResult create(@RequestBody OrderDetail orderDetail) {
        orderDetailService.create(orderDetail);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody OrderDetail orderDetail) {
        orderDetail.setId(id);
        orderDetailService.update(orderDetail);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        orderDetailService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        OrderDetail orderDetail = orderDetailService.findById(id);
        return new RestApiResultImpl(orderDetail);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<OrderDetail> orderDetails = orderDetailService.findAll();
        return new RestApiResultImpl(orderDetails);
    }
}
