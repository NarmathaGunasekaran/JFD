package com.nseit.RelationPost.respository;

import com.nseit.RelationPost.model.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationRespository extends JpaRepository<Relation,Integer> {
}
