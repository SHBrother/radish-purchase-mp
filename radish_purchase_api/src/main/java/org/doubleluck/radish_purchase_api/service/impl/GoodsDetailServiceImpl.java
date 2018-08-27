package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.GoodsDetail;
import org.doubleluck.radish_purchase_api.repository.GoodsDetailMapper;
import org.doubleluck.radish_purchase_api.service.GoodsDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class GoodsDetailServiceImpl implements GoodsDetailService {

    @Resource
    private GoodsDetailMapper goodsDetailMapper;

    @Override
    public void create(GoodsDetail goodsDetail) {

    }

    @Override
    public void update(GoodsDetail goodsDetail) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public GoodsDetail findById(Long id) {
        return null;
    }

    @Override
    public List<GoodsDetail> findAll() {
        return null;
    }
}
