package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.Role;
import org.doubleluck.radish_purchase_api.repository.RoleMapper;
import org.doubleluck.radish_purchase_api.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public void create(Role role) {

    }

    @Override
    public void update(Role role) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Role findById(Long id) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return null;
    }
}
