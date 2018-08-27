package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.GoodsDetailExample;
import org.doubleluck.radish_purchase_api.model.po.GoodsDetail;
import org.doubleluck.radish_purchase_api.repository.GoodsDetailMapper;
import org.doubleluck.radish_purchase_api.service.GoodsDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GoodsDetailServiceImpl implements GoodsDetailService {

    @Resource
    private GoodsDetailMapper goodsDetailMapper;

    @Override
    public void create(GoodsDetail goodsDetail) {
        goodsDetailMapper.insertSelective(goodsDetail);
    }

    @Override
    public void update(GoodsDetail goodsDetail) {
        goodsDetailMapper.updateByPrimaryKeySelective(goodsDetail);
    }

    @Override
    public void remove(Long id) {
        GoodsDetail goodsDetail = GoodsDetail.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        goodsDetailMapper.updateByPrimaryKeySelective(goodsDetail);
    }

    @Override
    public GoodsDetail findById(Long id) {
        return goodsDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsDetail> findAll() {
        return Optional.ofNullable(goodsDetailMapper.selectByExample(new GoodsDetailExample())).orElse(Collections.emptyList());
    }
}
