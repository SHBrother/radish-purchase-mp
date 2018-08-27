package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.GoodsPicRel;
import org.doubleluck.radish_purchase_api.repository.GoodsPicRelMapper;
import org.doubleluck.radish_purchase_api.service.GoodsPicRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class GoodsPicRelServiceImpl implements GoodsPicRelService {

    @Resource
    private GoodsPicRelMapper goodsPicRelMapper;

    @Override
    public void create(GoodsPicRel goodsPicRel) {

    }

    @Override
    public void update(GoodsPicRel goodsPicRel) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public GoodsPicRel findById(Long id) {
        return null;
    }

    @Override
    public List<GoodsPicRel> findAll() {
        return null;
    }
}
