package com.iamvickyav.springboot.SpringBootRestWithH2.mera;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserEntity, Long> {

    @Query(value = "select * from user join role on user.role_fk = role.role_id where role.name = :userName", nativeQuery = true)
    List<UserEntity> getRoleForUser(@Param("userName") String userName);
}
