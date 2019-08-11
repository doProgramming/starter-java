package com.iamvickyav.springboot.SpringBootRestWithH2.mera;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
@Data
public class UserRoleRepositoryEntity {

    @Id
    @Column(name = "role_repository_id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER,optional=false)
    @JoinColumn(name = "fk_user", nullable = true, updatable = false)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.EAGER,optional=false)
    @JoinColumn(name = "fk_role", nullable = true, updatable = false)
    private RoleEntity role;
}
