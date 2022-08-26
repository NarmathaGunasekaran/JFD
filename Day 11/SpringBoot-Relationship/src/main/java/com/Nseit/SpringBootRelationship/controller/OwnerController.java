package com.Nseit.SpringBootRelationship.controller;

import com.Nseit.SpringBootRelationship.model.Owner;
import com.Nseit.SpringBootRelationship.model.Vehicle;
import com.Nseit.SpringBootRelationship.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/owner")
@RestController
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @PostMapping
    public void add(Owner owner) {
        ownerService.add(owner);
    }

    @GetMapping
    public void view() {
        ownerService.view();
    }

}
