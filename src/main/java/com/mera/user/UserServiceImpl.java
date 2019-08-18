package com.mera.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "this")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public List<UserEntity> getUsersForProvidedRole(String roleName) {
        List<UserEntity> users = userRoleRepository.getRoleForUser(roleName);
        return users;
    }
}
