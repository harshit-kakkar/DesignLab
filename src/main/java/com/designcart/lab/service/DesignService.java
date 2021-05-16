package com.designcart.lab.service;

import com.designcart.lab.entities.Design;
import com.designcart.lab.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DesignService {

    @Autowired
    private DesignRepository designRepository;

    public Design saveDesign(Design design){
        Design savedDesign = designRepository.save(design);

        return savedDesign;
    }
    public Optional<Design> getById(Integer id){
        return designRepository.findById(id);
    }
}
