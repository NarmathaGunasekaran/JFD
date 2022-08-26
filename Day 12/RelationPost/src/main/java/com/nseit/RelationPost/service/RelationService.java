package com.nseit.RelationPost.service;

import com.nseit.RelationPost.model.Relation;
import com.nseit.RelationPost.respository.RelationRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationService {
    @Autowired
    private RelationRespository relationRespository;

    public void add(Relation relation){
        relationRespository.save(relation);
    }
}
