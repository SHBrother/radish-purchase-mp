package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.GoodsExample;
import org.doubleluck.radish_purchase_api.model.po.Goods;
import org.doubleluck.radish_purchase_api.repository.GoodsMapper;
import org.doubleluck.radish_purchase_api.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public void create(Goods goods) {
        goodsMapper.insertSelective(goods);
    }

    @Override
    public void update(Goods goods) {
        goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public void remove(Long id) {
        Goods goods = Goods.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public Goods findById(Long id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Goods> findAll() {
        return Optional.ofNullable(goodsMapper.selectByExample(new GoodsExample())).orElse(Collections.emptyList());
    }

}
