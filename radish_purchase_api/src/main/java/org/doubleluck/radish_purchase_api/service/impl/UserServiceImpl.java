package org.doubleluck.radish_purchase_api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.config.Constant;
import org.doubleluck.radish_purchase_api.model.example.UserExample;
import org.doubleluck.radish_purchase_api.model.po.User;
import org.doubleluck.radish_purchase_api.repository.UserMapper;
import org.doubleluck.radish_purchase_api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void create(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void remove(Long id) {
        User user = User.builder().id(id).deleteFlag(Constant.IS_DELETED).build();
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findAll() {
        return Optional.ofNullable(userMapper.selectByExample(new UserExample())).orElse(Collections.emptyList());
    }
}
