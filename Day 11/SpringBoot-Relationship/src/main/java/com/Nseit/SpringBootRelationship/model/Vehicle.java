package com.Nseit.SpringBootRelationship.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
@Data
public class Vehicle {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer number;
    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_Id", nullable = false, referencedColumnName = "ownerId")
    private Owner owner;
}
