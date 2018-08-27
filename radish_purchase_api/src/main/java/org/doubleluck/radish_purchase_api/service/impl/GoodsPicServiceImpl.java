package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.GoodsPic;
import org.doubleluck.radish_purchase_api.repository.GoodsPicMapper;
import org.doubleluck.radish_purchase_api.service.GoodsPicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class GoodsPicServiceImpl implements GoodsPicService {

    @Resource
    private GoodsPicMapper goodsPicMapper;

    @Override
    public void create(GoodsPic goodsPic) {

    }

    @Override
    public void update(GoodsPic goodsPic) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public GoodsPic findById(Long id) {
        return null;
    }

    @Override
    public List<GoodsPic> findAll() {
        return null;
    }
}
