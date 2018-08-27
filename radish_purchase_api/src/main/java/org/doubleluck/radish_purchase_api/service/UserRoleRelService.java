package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.UserRoleRel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRoleRelService {

    @Transactional
    void create(UserRoleRel userRoleRel);

    @Transactional
    void update(UserRoleRel userRoleRel);

    @Transactional
    void remove(Long id);

    UserRoleRel findById(Long id);

    List<UserRoleRel> findAll();

}