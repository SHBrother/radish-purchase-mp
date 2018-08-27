package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.UserRoleRelExample;
import org.doubleluck.radish_purchase_api.model.po.UserRoleRel;
import org.doubleluck.radish_purchase_api.repository.UserRoleRelMapper;
import org.doubleluck.radish_purchase_api.service.UserRoleRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserRoleRelServiceImpl implements UserRoleRelService {

    @Resource
    private UserRoleRelMapper userRoleRelMapper;

    @Override
    public void create(UserRoleRel userRoleRel) {
        userRoleRelMapper.insertSelective(userRoleRel);
    }

    @Override
    public void update(UserRoleRel userRoleRel) {
        userRoleRelMapper.updateByPrimaryKeySelective(userRoleRel);
    }

    @Override
    public void remove(Long id) {
        UserRoleRel userRoleRel = UserRoleRel.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        userRoleRelMapper.updateByPrimaryKeySelective(userRoleRel);
    }

    @Override
    public UserRoleRel findById(Long id) {
        return userRoleRelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserRoleRel> findAll() {
        return Optional.ofNullable(userRoleRelMapper.selectByExample(new UserRoleRelExample())).orElse(Collections.emptyList());
    }
}
