package com.iamvickyav.springboot.SpringBootRestWithH2.mera;

import java.util.List;

public interface UserService {

    List<UserEntity> getUsersForProvidedRole(String roleName);
}
