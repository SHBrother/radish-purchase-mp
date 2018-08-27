package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.GoodsDetailStatusExample;
import org.doubleluck.radish_purchase_api.model.po.GoodsDetailStatus;
import org.doubleluck.radish_purchase_api.repository.GoodsDetailStatusMapper;
import org.doubleluck.radish_purchase_api.service.GoodsDetailStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GoodsDetailStatusServiceImpl implements GoodsDetailStatusService {

    @Resource
    private GoodsDetailStatusMapper goodsDetailStatusMapper;

    @Override
    public void create(GoodsDetailStatus goodsDetailStatus) {
        goodsDetailStatusMapper.insertSelective(goodsDetailStatus);
    }

    @Override
    public void update(GoodsDetailStatus goodsDetailStatus) {
        goodsDetailStatusMapper.updateByPrimaryKeySelective(goodsDetailStatus);
    }

    @Override
    public void remove(Long id) {
        GoodsDetailStatus goodsDetailStatus = GoodsDetailStatus.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        goodsDetailStatusMapper.updateByPrimaryKeySelective(goodsDetailStatus);
    }

    @Override
    public GoodsDetailStatus findById(Long id) {
        return goodsDetailStatusMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsDetailStatus> findAll() {
        return Optional.ofNullable(goodsDetailStatusMapper.selectByExample(new GoodsDetailStatusExample())).orElse(Collections.emptyList());
    }
}
