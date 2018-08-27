package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.RoleExample;
import org.doubleluck.radish_purchase_api.model.po.Role;
import org.doubleluck.radish_purchase_api.repository.RoleMapper;
import org.doubleluck.radish_purchase_api.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public void create(Role role) {
        roleMapper.insertSelective(role);
    }

    @Override
    public void update(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public void remove(Long id) {
        Role role = Role.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public Role findById(Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> findAll() {
        return Optional.ofNullable(roleMapper.selectByExample(new RoleExample())).orElse(Collections.emptyList());
    }
}
