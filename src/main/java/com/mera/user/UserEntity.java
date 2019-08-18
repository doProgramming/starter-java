package com.mera.user;

import com.mera.role.RoleEntity;
import com.mera.address.AddressEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.EAGER,optional=false)
    @JoinColumn(name = "fk_role")
    private RoleEntity role;

    @ManyToOne(fetch = FetchType.EAGER,optional=false)
    @JoinColumn(name = "fk_address")
    private AddressEntity address;
}
