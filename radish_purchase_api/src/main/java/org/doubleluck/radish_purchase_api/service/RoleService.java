package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.Role;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RoleService {

    @Transactional
    void create(Role role);

    @Transactional
    void update(Role role);

    @Transactional
    void remove(Long id);

    Role findById(Long id);

    List<Role> findAll();

}