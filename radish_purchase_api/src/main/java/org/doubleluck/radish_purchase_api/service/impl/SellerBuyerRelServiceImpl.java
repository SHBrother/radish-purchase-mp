package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.SellerBuyerRelExample;
import org.doubleluck.radish_purchase_api.model.po.SellerBuyerRel;
import org.doubleluck.radish_purchase_api.repository.SellerBuyerRelMapper;
import org.doubleluck.radish_purchase_api.service.SellerBuyerRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class SellerBuyerRelServiceImpl implements SellerBuyerRelService {

    @Resource
    private SellerBuyerRelMapper sellerBuyerRelMapper;

    @Override
    public void create(SellerBuyerRel sellerBuyerRel) {
        sellerBuyerRelMapper.insertSelective(sellerBuyerRel);
    }

    @Override
    public void update(SellerBuyerRel sellerBuyerRel) {
        sellerBuyerRelMapper.updateByPrimaryKeySelective(sellerBuyerRel);
    }

    @Override
    public void remove(Long id) {
        SellerBuyerRel sellerBuyerRel = SellerBuyerRel.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        sellerBuyerRelMapper.updateByPrimaryKeySelective(sellerBuyerRel);
    }

    @Override
    public SellerBuyerRel findById(Long id) {
        return sellerBuyerRelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SellerBuyerRel> findAll() {
        return Optional.ofNullable(sellerBuyerRelMapper.selectByExample(new SellerBuyerRelExample())).orElse(Collections.emptyList());
    }
}
