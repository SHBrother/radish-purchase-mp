package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.GoodsOperationLogExample;
import org.doubleluck.radish_purchase_api.model.po.GoodsOperationLog;
import org.doubleluck.radish_purchase_api.repository.GoodsOperationLogMapper;
import org.doubleluck.radish_purchase_api.service.GoodsOperationLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GoodsOperationLogServiceImpl implements GoodsOperationLogService {

    @Resource
    private GoodsOperationLogMapper goodsOperationLogMapper;

    @Override
    public void create(GoodsOperationLog goodsOperationLog) {
        goodsOperationLogMapper.insertSelective(goodsOperationLog);
    }

    @Override
    public void update(GoodsOperationLog goodsOperationLog) {
        // TODO
    }

    @Override
    public void remove(Long id) {
        GoodsOperationLog goodsOperationLog = GoodsOperationLog.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        goodsOperationLogMapper.updateByPrimaryKeySelective(goodsOperationLog);
    }

    @Override
    public GoodsOperationLog findById(Long id) {
        return goodsOperationLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsOperationLog> findAll() {
        return Optional.ofNullable(goodsOperationLogMapper.selectByExample(new GoodsOperationLogExample())).orElse(Collections.emptyList());
    }
}
