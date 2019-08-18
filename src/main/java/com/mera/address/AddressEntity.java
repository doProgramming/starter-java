package com.mera.address;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ADDRESS")
@Entity
@Data
public class AddressEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "phone")
    private int phone;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "street")
    private String street;

}
