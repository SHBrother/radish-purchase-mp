package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.GoodsPic;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GoodsPicService {

    @Transactional
    void create(GoodsPic goodsPic);

    @Transactional
    void update(GoodsPic goodsPic);

    @Transactional
    void remove(Long id);

    GoodsPic findById(Long id);

    List<GoodsPic> findAll();

}