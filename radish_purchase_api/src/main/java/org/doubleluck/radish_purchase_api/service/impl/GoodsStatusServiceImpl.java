package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.GoodsStatus;
import org.doubleluck.radish_purchase_api.repository.GoodsStatusMapper;
import org.doubleluck.radish_purchase_api.service.GoodsStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class GoodsStatusServiceImpl implements GoodsStatusService {

    @Resource
    private GoodsStatusMapper goodsStatusMapper;

    @Override
    public void create(GoodsStatus goodsStatus) {

    }

    @Override
    public void update(GoodsStatus goodsStatus) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public GoodsStatus findById(Long id) {
        return null;
    }

    @Override
    public List<GoodsStatus> findAll() {
        return null;
    }
}
