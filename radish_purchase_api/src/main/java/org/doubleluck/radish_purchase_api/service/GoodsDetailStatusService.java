package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.GoodsDetailStatus;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GoodsDetailStatusService {

    @Transactional
    void create(GoodsDetailStatus goodsDetailStatus);

    @Transactional
    void update(GoodsDetailStatus goodsDetailStatus);

    @Transactional
    void remove(Long id);

    GoodsDetailStatus findById(Long id);

    List<GoodsDetailStatus> findAll();

}