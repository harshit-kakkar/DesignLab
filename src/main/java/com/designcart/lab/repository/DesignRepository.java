package com.designcart.lab.repository;

import com.designcart.lab.entities.Design;
import org.springframework.data.repository.CrudRepository;

public interface DesignRepository extends CrudRepository<Design, Integer> {
}
