package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.GoodsDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GoodsDetailService {

    @Transactional
    void create(GoodsDetail goodsDetail);

    @Transactional
    void update(GoodsDetail goodsDetail);

    @Transactional
    void remove(Long id);

    GoodsDetail findById(Long id);

    List<GoodsDetail> findAll();

}