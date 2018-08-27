package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.GoodsClassifyExample;
import org.doubleluck.radish_purchase_api.model.po.GoodsClassify;
import org.doubleluck.radish_purchase_api.repository.GoodsClassifyMapper;
import org.doubleluck.radish_purchase_api.service.GoodsClassifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GoodsClassifyServiceImpl implements GoodsClassifyService {

    @Resource
    private GoodsClassifyMapper goodsClassifyMapper;

    @Override
    public void create(GoodsClassify goodsClassify) {
        goodsClassifyMapper.insertSelective(goodsClassify);
    }

    @Override
    public void update(GoodsClassify goodsClassify) {
        goodsClassifyMapper.updateByPrimaryKeySelective(goodsClassify);
    }

    @Override
    public void remove(Long id) {
        GoodsClassify goodsClassify = GoodsClassify.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        goodsClassifyMapper.updateByPrimaryKeySelective(goodsClassify);
    }

    @Override
    public GoodsClassify findById(Long id) {
        return goodsClassifyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsClassify> findAll() {
        List<GoodsClassify> list = goodsClassifyMapper.selectByExample(new GoodsClassifyExample());
        return Optional.ofNullable(list).orElse(Collections.emptyList());
    }
}