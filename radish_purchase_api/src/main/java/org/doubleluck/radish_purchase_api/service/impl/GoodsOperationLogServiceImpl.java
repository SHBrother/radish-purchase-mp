package org.doubleluck.radish_purchase_api.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.GoodsOperationLog;
import org.doubleluck.radish_purchase_api.repository.GoodsOperationLogMapper;
import org.doubleluck.radish_purchase_api.service.GoodsOperationLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class GoodsOperationLogServiceImpl implements GoodsOperationLogService {

    @Resource
    private GoodsOperationLogMapper goodsOperationLogMapper;

    @Override
    public void create(GoodsOperationLog goodsOperationLog) {

    }

    @Override
    public void update(GoodsOperationLog goodsOperationLog) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public GoodsOperationLog findById(Long id) {
        return null;
    }

    @Override
    public List<GoodsOperationLog> findAll() {
        return null;
    }
}
