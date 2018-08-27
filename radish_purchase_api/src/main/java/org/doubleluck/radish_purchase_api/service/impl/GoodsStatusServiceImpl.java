package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.GoodsStatusExample;
import org.doubleluck.radish_purchase_api.model.po.GoodsStatus;
import org.doubleluck.radish_purchase_api.repository.GoodsStatusMapper;
import org.doubleluck.radish_purchase_api.service.GoodsStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GoodsStatusServiceImpl implements GoodsStatusService {

    @Resource
    private GoodsStatusMapper goodsStatusMapper;

    @Override
    public void create(GoodsStatus goodsStatus) {
        goodsStatusMapper.insertSelective(goodsStatus);
    }

    @Override
    public void update(GoodsStatus goodsStatus) {
        goodsStatusMapper.updateByPrimaryKeySelective(goodsStatus);
    }

    @Override
    public void remove(Long id) {
        GoodsStatus goodsStatus = GoodsStatus.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        goodsStatusMapper.updateByPrimaryKeySelective(goodsStatus);
    }

    @Override
    public GoodsStatus findById(Long id) {
        return goodsStatusMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsStatus> findAll() {
        return Optional.ofNullable(goodsStatusMapper.selectByExample(new GoodsStatusExample())).orElse(Collections.emptyList());
    }
}
