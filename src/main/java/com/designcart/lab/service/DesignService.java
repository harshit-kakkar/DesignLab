package com.designcart.lab.service;

import com.designcart.lab.entities.Design;
import com.designcart.lab.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignService {

    @Autowired
    private DesignRepository designRepository;

    public String saveDesign(Design design){
        designRepository.save(design);
        return "Saved successfully";
    }
}
