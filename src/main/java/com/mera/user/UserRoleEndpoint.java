package com.mera.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRoleEndpoint {

    @Autowired
    @Qualifier("this")
    UserService userService;

    @GetMapping(value = "/getUser")
    //case sensitive
    @PreAuthorize("hasRole('ADMIN')")
    public List<UserEntity> returnUser(@RequestParam String nameRole){
        return userService.getUsersForProvidedRole(nameRole);
    }
}
