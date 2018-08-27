package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.GoodsClassify;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GoodsClassifyService {

    @Transactional
    void create(GoodsClassify goodsClassify);

    @Transactional
    void update(GoodsClassify goodsClassify);

    @Transactional
    void remove(Long id);

    GoodsClassify findById(Long id);

    List<GoodsClassify> findAll();

}