package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.SellerBuyerRel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SellerBuyerRelService {

    @Transactional
    void create(SellerBuyerRel sellerBuyerRel);

    @Transactional
    void update(SellerBuyerRel sellerBuyerRel);

    @Transactional
    void remove(Long id);

    SellerBuyerRel findById(Long id);

    List<SellerBuyerRel> findAll();

}