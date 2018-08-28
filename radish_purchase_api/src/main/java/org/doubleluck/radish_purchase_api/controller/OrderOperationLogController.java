package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.OrderOperationLog;
import org.doubleluck.radish_purchase_api.service.OrderOperationLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/orderOperationLog")
public class OrderOperationLogController {

    @Resource
    private OrderOperationLogService orderOperationLogService;

    @PostMapping("")
    public RestApiResult create(@RequestBody OrderOperationLog orderOperationLog) {
        orderOperationLogService.create(orderOperationLog);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody OrderOperationLog orderOperationLog) {
        orderOperationLog.setId(id);
        orderOperationLogService.update(orderOperationLog);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        orderOperationLogService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        OrderOperationLog orderOperationLog = orderOperationLogService.findById(id);
        return new RestApiResultImpl(orderOperationLog);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<OrderOperationLog> orderOperationLogs = orderOperationLogService.findAll();
        return new RestApiResultImpl(orderOperationLogs);
    }
}
