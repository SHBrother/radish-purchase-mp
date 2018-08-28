package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.User;
import org.doubleluck.radish_purchase_api.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("")
    public RestApiResult create(@RequestBody User user) {
        userService.create(user);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        userService.update(user);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        userService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        User user = userService.findById(id);
        return new RestApiResultImpl(user);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<User> users = userService.findAll();
        return new RestApiResultImpl(users);
    }
}
