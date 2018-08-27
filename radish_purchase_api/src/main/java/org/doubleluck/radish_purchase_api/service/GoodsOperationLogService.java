package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.GoodsOperationLog;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GoodsOperationLogService {

    @Transactional
    void create(GoodsOperationLog goodsOperationLog);

    @Transactional
    void update(GoodsOperationLog goodsOperationLog);

    @Transactional
    void remove(Long id);

    GoodsOperationLog findById(Long id);

    List<GoodsOperationLog> findAll();

}