package com.Nseit.SpringBootRelationship.respository;

import com.Nseit.SpringBootRelationship.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRespository extends JpaRepository<Owner,Integer> {
}
