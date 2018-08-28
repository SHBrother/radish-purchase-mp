package org.doubleluck.radish_purchase_api.controller;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.doubleluck.radish_purchase_api.model.po.Role;
import org.doubleluck.radish_purchase_api.service.RoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl.TRUE_REST_API_RESULT;

@RestController
@RequestMapping("/api/v1.0/role")
public class RoleController {

    @Resource
    private RoleService roleService;
    
    @PostMapping("")
    public RestApiResult create(@RequestBody Role role) {
        roleService.create(role);
        return TRUE_REST_API_RESULT;
    }

    @PutMapping("/{id}")
    public RestApiResult update(@PathVariable Long id, @RequestBody Role role) {
        role.setId(id);
        roleService.update(role);
        return TRUE_REST_API_RESULT;
    }

    @DeleteMapping("/{id}")
    public RestApiResult remove(@PathVariable Long id) {
        roleService.remove(id);
        return TRUE_REST_API_RESULT;
    }

    @GetMapping("/{id}")
    public RestApiResult find(@PathVariable Long id) {
        Role role = roleService.findById(id);
        return new RestApiResultImpl(role);
    }

    @GetMapping("/list")
    public RestApiResult findAll() {
        List<Role> roles = roleService.findAll();
        return new RestApiResultImpl(roles);
    }
}
