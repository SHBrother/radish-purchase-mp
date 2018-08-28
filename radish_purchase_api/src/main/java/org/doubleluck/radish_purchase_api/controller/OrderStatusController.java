package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.OrderStatus;
import org.doubleluck.radish_purchase_api.service.OrderStatusService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/orderStatus")
public class OrderStatusController {

    @Resource
    private OrderStatusService orderStatusService;

    @PostMapping("")
    public RestApiResult create(@RequestBody OrderStatus orderStatus) {
        orderStatusService.create(orderStatus);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody OrderStatus orderStatus) {
        orderStatus.setId(id);
        orderStatusService.update(orderStatus);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        orderStatusService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        OrderStatus orderStatus = orderStatusService.findById(id);
        return new RestApiResultImpl(orderStatus);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<OrderStatus> orderStatuses = orderStatusService.findAll();
        return new RestApiResultImpl(orderStatuses);
    }
}
