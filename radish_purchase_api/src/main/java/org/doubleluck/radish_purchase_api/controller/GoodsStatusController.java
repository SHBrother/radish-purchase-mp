package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.GoodsStatus;
import org.doubleluck.radish_purchase_api.service.GoodsStatusService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/goodsStatus")
public class GoodsStatusController {

    @Resource
    private GoodsStatusService goodsStatusService;

    @PostMapping("")
    public RestApiResult create(@RequestBody GoodsStatus goodsStatus) {
        goodsStatusService.create(goodsStatus);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody GoodsStatus goodsStatus) {
        goodsStatus.setId(id);
        goodsStatusService.update(goodsStatus);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        goodsStatusService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        GoodsStatus goodsStatus = goodsStatusService.findById(id);
        return new RestApiResultImpl(goodsStatus);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<GoodsStatus> goodsStatuses = goodsStatusService.findAll();
        return new RestApiResultImpl(goodsStatuses);
    }
}
