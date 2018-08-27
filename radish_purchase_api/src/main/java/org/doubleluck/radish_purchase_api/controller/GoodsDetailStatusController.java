package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.service.GoodsDetailStatusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v1.0/goodsDetailStatus")
public class GoodsDetailStatusController {

    @Resource
    private GoodsDetailStatusService goodsDetailStatusService;

}
