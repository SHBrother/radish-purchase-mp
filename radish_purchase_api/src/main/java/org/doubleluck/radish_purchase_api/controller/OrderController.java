package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.Order;
import org.doubleluck.radish_purchase_api.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("")
    public RestApiResult create(@RequestBody Order order) {
        orderService.create(order);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody Order order) {
        order.setId(id);
        orderService.update(order);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        orderService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        Order order = orderService.findById(id);
        return new RestApiResultImpl(order);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<Order> orders = orderService.findAll();
        return new RestApiResultImpl(orders);
    }
}
