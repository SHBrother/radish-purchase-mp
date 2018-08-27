package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.GoodsPicRel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GoodsPicRelService {

    @Transactional
    void create(GoodsPicRel goodsPicRel);

    @Transactional
    void update(GoodsPicRel goodsPicRel);

    @Transactional
    void remove(Long id);

    GoodsPicRel findById(Long id);

    List<GoodsPicRel> findAll();

}