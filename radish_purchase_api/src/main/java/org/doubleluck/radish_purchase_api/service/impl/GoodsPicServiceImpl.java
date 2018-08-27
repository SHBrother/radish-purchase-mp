package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.GoodsPicExample;
import org.doubleluck.radish_purchase_api.model.po.GoodsPic;
import org.doubleluck.radish_purchase_api.repository.GoodsPicMapper;
import org.doubleluck.radish_purchase_api.service.GoodsPicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GoodsPicServiceImpl implements GoodsPicService {

    @Resource
    private GoodsPicMapper goodsPicMapper;

    @Override
    public void create(GoodsPic goodsPic) {
        goodsPicMapper.insertSelective(goodsPic);
    }

    @Override
    public void update(GoodsPic goodsPic) {
        goodsPicMapper.updateByPrimaryKeySelective(goodsPic);
    }

    @Override
    public void remove(Long id) {
        GoodsPic goodsPic = GoodsPic.builder().id(id).deletedFlag(Constant.IS_DELETED).build();
        goodsPicMapper.updateByPrimaryKeySelective(goodsPic);
    }

    @Override
    public GoodsPic findById(Long id) {
        return goodsPicMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsPic> findAll() {
        return Optional.ofNullable(goodsPicMapper.selectByExample(new GoodsPicExample())).orElse(Collections.emptyList());
    }
}
