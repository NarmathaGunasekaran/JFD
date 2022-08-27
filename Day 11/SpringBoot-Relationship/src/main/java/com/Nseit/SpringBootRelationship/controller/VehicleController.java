package com.Nseit.SpringBootRelationship.controller;

import com.Nseit.SpringBootRelationship.model.Vehicle;
import com.Nseit.SpringBootRelationship.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/vehicle")
@RestController
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public void add(@RequestBody Vehicle vehicle) {
        vehicleService.add(vehicle);
    }

    @GetMapping
    public void view() {
        vehicleService.view();
    }

    @PutMapping()
    public void update(Vehicle vehicle) {
        vehicleService.update(vehicle);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        vehicleService.delete(id);

    }
}
