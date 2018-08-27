package org.doubleluck.radish_purchase_api.service;

import org.doubleluck.radish_purchase_api.model.po.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    @Transactional
    void create(User user);

    @Transactional
    void update(User user);

    @Transactional
    void remove(Long id);

    User findById(Long id);

    List<User> findAll();

}