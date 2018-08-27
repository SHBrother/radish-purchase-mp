package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.SellerBuyerRel;
import org.doubleluck.radish_purchase_api.repository.SellerBuyerRelMapper;
import org.doubleluck.radish_purchase_api.service.SellerBuyerRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class SellerBuyerRelServiceImpl implements SellerBuyerRelService {

    @Resource
    private SellerBuyerRelMapper sellerBuyerRelMapper;

    @Override
    public void create(SellerBuyerRel sellerBuyerRel) {

    }

    @Override
    public void update(SellerBuyerRel sellerBuyerRel) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public SellerBuyerRel findById(Long id) {
        return null;
    }

    @Override
    public List<SellerBuyerRel> findAll() {
        return null;
    }
}
