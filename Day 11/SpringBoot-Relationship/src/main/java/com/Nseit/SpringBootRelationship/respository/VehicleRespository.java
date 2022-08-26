package com.Nseit.SpringBootRelationship.respository;

import com.Nseit.SpringBootRelationship.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRespository extends JpaRepository<Vehicle,Integer> {

}
