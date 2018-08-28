package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.GoodsClassify;
import org.doubleluck.radish_purchase_api.service.GoodsClassifyService;
import org.springframework.web.bind.annotation.*;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0/goodsClassify")
public class GoodsClassifyController {

    @Resource
    private GoodsClassifyService goodsClassifyService;

    @PostMapping("")
    public RestApiResult create(@RequestBody GoodsClassify goodsClassify) {
        goodsClassifyService.create(goodsClassify);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody GoodsClassify goodsClassify) {
        goodsClassify.setId(id);
        goodsClassifyService.update(goodsClassify);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        goodsClassifyService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        GoodsClassify goodsClassify = goodsClassifyService.findById(id);
        return new RestApiResultImpl(goodsClassify);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<GoodsClassify> goodsClassifies = goodsClassifyService.findAll();
        return new RestApiResultImpl(goodsClassifies);
    }

}
