package com.iamvickyav.springboot.SpringBootRestWithH2.mera;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToOne(fetch = FetchType.EAGER,optional=false)
    @JoinColumn(name = "role_fk")
    private RoleEntity role;
}
