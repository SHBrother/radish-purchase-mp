package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.GoodsOperationLog;
import org.doubleluck.radish_purchase_api.service.GoodsOperationLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/goodsOperationLog")
public class GoodsOperationLogController {

    @Resource
    private GoodsOperationLogService goodsOperationLogService;

    @PostMapping("")
    public RestApiResult create(@RequestBody GoodsOperationLog goodsOperationLog) {
        goodsOperationLogService.create(goodsOperationLog);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody GoodsOperationLog goodsOperationLog) {
        goodsOperationLog.setId(id);
        goodsOperationLogService.update(goodsOperationLog);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        goodsOperationLogService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        GoodsOperationLog goodsOperationLog = goodsOperationLogService.findById(id);
        return new RestApiResultImpl(goodsOperationLog);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<GoodsOperationLog> goodsOperationLogs = goodsOperationLogService.findAll();
        return new RestApiResultImpl(goodsOperationLogs);
    }
}
