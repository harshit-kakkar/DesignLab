package com.designcart.lab.controller;


import com.designcart.lab.entities.Design;
import com.designcart.lab.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/design")
public class DesignController {

    @Autowired
    private DesignService designService;

    @GetMapping("/{id}")
    public Optional<Design> getSavedDesign(@PathVariable("id") Integer id){
        return designService.getById(id);
    }

    @PostMapping("/save")
    public Design create(@RequestBody Design design){
        // Save details of a design and return the ID of that design
        return designService.saveDesign(design);
    }

}
