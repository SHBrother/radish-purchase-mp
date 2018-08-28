package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.Goods;
import org.doubleluck.radish_purchase_api.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0/goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @PostMapping("")
    public RestApiResult create(@RequestBody Goods goods) {
        goodsService.create(goods);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody Goods goods) {
        goods.setId(id);
        goodsService.update(goods);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        goodsService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        Goods goods = goodsService.findById(id);
        return new RestApiResultImpl(goods);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<Goods> goods = goodsService.findAll();
        return new RestApiResultImpl(goods);
    }

}
