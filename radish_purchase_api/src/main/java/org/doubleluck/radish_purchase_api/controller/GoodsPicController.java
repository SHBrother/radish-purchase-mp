package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.GoodsPic;
import org.doubleluck.radish_purchase_api.service.GoodsPicService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/goodsPic")
public class GoodsPicController {

    @Resource
    private GoodsPicService goodsPicService;

    @PostMapping("")
    public RestApiResult create(@RequestBody GoodsPic goodsPic) {
        goodsPicService.create(goodsPic);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody GoodsPic goodsPic) {
        goodsPic.setId(id);
        goodsPicService.update(goodsPic);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        goodsPicService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        GoodsPic goodsPic = goodsPicService.findById(id);
        return new RestApiResultImpl(goodsPic);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<GoodsPic> goodsPics = goodsPicService.findAll();
        return new RestApiResultImpl(goodsPics);
    }
}
