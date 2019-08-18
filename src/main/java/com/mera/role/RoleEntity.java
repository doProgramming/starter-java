package com.mera.role;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
@Data
public class RoleEntity {

    @Column(name = "id")
    @Id
    private int id;

    @Column(name = "type")
    private String type;
}
