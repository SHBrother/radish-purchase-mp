package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.GoodsDetail;
import org.doubleluck.radish_purchase_api.service.GoodsDetailService;
import org.springframework.web.bind.annotation.*;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0/goodsDetail")
public class GoodsDetailController {

    @Resource
    private GoodsDetailService goodsDetailService;

    @PostMapping("")
    public RestApiResult create(@RequestBody GoodsDetail goodsDetail) {
        goodsDetailService.create(goodsDetail);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody GoodsDetail goodsDetail) {
        goodsDetail.setId(id);
        goodsDetailService.update(goodsDetail);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        goodsDetailService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        GoodsDetail goodsDetail = goodsDetailService.findById(id);
        return new RestApiResultImpl(goodsDetail);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<GoodsDetail> goodsDetails = goodsDetailService.findAll();
        return new RestApiResultImpl(goodsDetails);
    }

}
