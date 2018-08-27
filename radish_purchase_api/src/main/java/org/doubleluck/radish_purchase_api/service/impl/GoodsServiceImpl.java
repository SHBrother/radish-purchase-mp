package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.Goods;
import org.doubleluck.radish_purchase_api.repository.GoodsMapper;
import org.doubleluck.radish_purchase_api.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public void create(Goods goods) {

    }

    @Override
    public void update(Goods goods) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Goods findById(Long id) {
        return null;
    }

    @Override
    public List<Goods> findAll() {
        return null;
    }
}
