package com.iamvickyav.springboot.SpringBootRestWithH2.mera;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
@Data
public class RoleEntity {

    @Column(name = "role_id")
    @Id
    private int id;

    @Column(name = "name")
    private String name;
}
