package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.GoodsClassify;
import org.doubleluck.radish_purchase_api.repository.GoodsClassifyMapper;
import org.doubleluck.radish_purchase_api.service.GoodsClassifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class GoodsClassifyServiceImpl implements GoodsClassifyService {

    @Resource
    private GoodsClassifyMapper goodsClassifyMapper;

    @Override
    public void create(GoodsClassify goodsClassify) {

    }

    @Override
    public void update(GoodsClassify goodsClassify) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public GoodsClassify findById(Long id) {
        return null;
    }

    @Override
    public List<GoodsClassify> findAll() {
        return null;
    }
}