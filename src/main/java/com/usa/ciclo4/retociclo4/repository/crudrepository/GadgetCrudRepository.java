package com.usa.ciclo4.retociclo4.repository.crudrepository;

import com.usa.ciclo4.retociclo4.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GadgetCrudRepository extends MongoRepository<Gadget, Integer> {
    public List<Gadget> findByPriceLessThanEqual(double price);
    public List<Gadget> findByDescriptionContainingIgnoreCase(String description);
}
