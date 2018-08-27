package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.po.UserRoleRel;
import org.doubleluck.radish_purchase_api.repository.UserRoleRelMapper;
import org.doubleluck.radish_purchase_api.service.UserRoleRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UserRoleRelServiceImpl implements UserRoleRelService {

    @Resource
    private UserRoleRelMapper userRoleRelMapper;

    @Override
    public void create(UserRoleRel userRoleRel) {

    }

    @Override
    public void update(UserRoleRel userRoleRel) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public UserRoleRel findById(Long id) {
        return null;
    }

    @Override
    public List<UserRoleRel> findAll() {
        return null;
    }
}
