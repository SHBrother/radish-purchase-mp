package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.Goods;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GoodsService {

    @Transactional
    void create(Goods goods);

    @Transactional
    void update(Goods goods);

    @Transactional
    void remove(Long id);

    Goods findById(Long id);

    List<Goods> findAll();


}