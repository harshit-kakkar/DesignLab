package com.designcart.lab.controller;


import com.designcart.lab.entities.Design;
import com.designcart.lab.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/design")
public class DesignController {

    @Autowired
    private DesignService designService;

    @GetMapping("/")
    public String getSavedDesign(){
        return "Design details";
    }

    @PostMapping("/save")
    public String create(@RequestBody Design design){
        // Save details of a design and return the ID of that design
        return designService.saveDesign(design);
    }

}
