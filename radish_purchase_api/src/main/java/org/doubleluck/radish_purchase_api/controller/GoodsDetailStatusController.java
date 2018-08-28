package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.GoodsDetailStatus;
import org.doubleluck.radish_purchase_api.service.GoodsDetailStatusService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/goodsDetailStatus")
public class GoodsDetailStatusController {

    @Resource
    private GoodsDetailStatusService goodsDetailStatusService;

    @PostMapping("")
    public RestApiResult create(@RequestBody GoodsDetailStatus goodsDetailStatus) {
        goodsDetailStatusService.create(goodsDetailStatus);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody GoodsDetailStatus goodsDetailStatus) {
        goodsDetailStatus.setId(id);
        goodsDetailStatusService.update(goodsDetailStatus);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        goodsDetailStatusService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        GoodsDetailStatus goodsDetailStatus = goodsDetailStatusService.findById(id);
        return new RestApiResultImpl(goodsDetailStatus);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<GoodsDetailStatus> goodsDetailStatuses = goodsDetailStatusService.findAll();
        return new RestApiResultImpl(goodsDetailStatuses);
    }

}
