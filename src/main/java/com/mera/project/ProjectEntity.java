package com.mera.project;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class ProjectEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
