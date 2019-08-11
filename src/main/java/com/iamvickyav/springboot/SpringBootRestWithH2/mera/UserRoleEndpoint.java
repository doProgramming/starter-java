package com.iamvickyav.springboot.SpringBootRestWithH2.mera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRoleEndpoint {

    @Autowired
    @Qualifier("this")
    UserService userService;

    @GetMapping(value = "/getUser")
    public List<UserEntity> returnUser(String nameRole){
        return userService.getUsersForProvidedRole(nameRole);
    }
}
