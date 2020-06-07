package com.sprintboottestapi.sprintboottestapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sprintboottestapi.sprintboottestapi.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    @Override
    Product findOne(String id);

    @Override
    void delete(Product deleted);
}
