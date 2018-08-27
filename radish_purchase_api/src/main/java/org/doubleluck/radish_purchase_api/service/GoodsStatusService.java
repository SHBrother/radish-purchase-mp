package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.GoodsStatus;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GoodsStatusService {

    @Transactional
    void create(GoodsStatus goodsStatus);

    @Transactional
    void update(GoodsStatus goodsStatus);

    @Transactional
    void remove(Long id);

    GoodsStatus findById(Long id);

    List<GoodsStatus> findAll();

}