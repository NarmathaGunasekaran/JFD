package com.nseit.RelationPost.controller;

import com.nseit.RelationPost.model.Relation;
import com.nseit.RelationPost.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/relation")
@RestController
public class RelationController {

    @Autowired
    private RelationService relationService;

    @PostMapping
    public void add(@RequestBody Relation relation){
        relationService.add(relation);
    }
}
