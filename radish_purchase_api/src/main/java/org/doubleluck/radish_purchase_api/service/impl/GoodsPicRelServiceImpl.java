package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.GoodsPicRelExample;
import org.doubleluck.radish_purchase_api.model.po.GoodsPicRel;
import org.doubleluck.radish_purchase_api.repository.GoodsPicRelMapper;
import org.doubleluck.radish_purchase_api.service.GoodsPicRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GoodsPicRelServiceImpl implements GoodsPicRelService {

    @Resource
    private GoodsPicRelMapper goodsPicRelMapper;

    @Override
    public void create(GoodsPicRel goodsPicRel) {
        goodsPicRelMapper.insertSelective(goodsPicRel);
    }

    @Override
    public void update(GoodsPicRel goodsPicRel) {
        goodsPicRelMapper.updateByPrimaryKeySelective(goodsPicRel);
    }

    @Override
    public void remove(Long id) {
        GoodsPicRel goodsPicRel = GoodsPicRel.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        goodsPicRelMapper.updateByPrimaryKeySelective(goodsPicRel);
    }

    @Override
    public GoodsPicRel findById(Long id) {
        return goodsPicRelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsPicRel> findAll() {
        return Optional.ofNullable(goodsPicRelMapper.selectByExample(new GoodsPicRelExample())).orElse(Collections.emptyList());
    }
}
