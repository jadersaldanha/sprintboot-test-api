package com.sprintboottestapi.sprintboottestapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.sprintboottestapi.sprintboottestapi.models.Product;

/**
 *
 * @author didin
 */
public interface ProductRepository extends MongoRepository<Product, String> {
    @Override
    Product findOne(String id);

    @Override
    void delete(Product deleted);
}
