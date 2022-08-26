package com.Nseit.SpringBootRelationship.service;

import com.Nseit.SpringBootRelationship.model.Vehicle;
import com.Nseit.SpringBootRelationship.respository.OwnerRespository;
import com.Nseit.SpringBootRelationship.respository.VehicleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleService {
    @Autowired
    private VehicleRespository vehicleRespository;


    public void add(Vehicle vehicle) {
        vehicleRespository.save(vehicle);
    }

    public List<Vehicle> view() {
        return vehicleRespository.findAll();
    }

    public void update(Vehicle vehicle) {
        vehicleRespository.save(vehicle);
    }

    public void delete(int id) {
        for (Vehicle vehicle : vehicleRespository.findAll()) {
            if (id == vehicle.getId()) {
                vehicleRespository.delete(vehicle);
            }
        }
    }
}
