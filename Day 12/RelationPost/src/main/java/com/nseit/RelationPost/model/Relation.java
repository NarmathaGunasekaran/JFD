package com.nseit.RelationPost.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Relation {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
}
