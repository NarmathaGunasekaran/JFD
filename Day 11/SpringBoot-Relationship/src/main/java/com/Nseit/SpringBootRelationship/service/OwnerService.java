package com.Nseit.SpringBootRelationship.service;

import com.Nseit.SpringBootRelationship.model.Owner;
import com.Nseit.SpringBootRelationship.respository.OwnerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
    @Autowired
    private OwnerRespository ownerRespository;

    public void add(Owner owner){
        ownerRespository.save(owner);
    }
    public List<Owner> view() {
        return ownerRespository.findAll();
    }

}
