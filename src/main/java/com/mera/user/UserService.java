package com.mera.user;

import java.util.List;

public interface UserService {

    List<UserEntity> getUsersForProvidedRole(String roleName);
}
