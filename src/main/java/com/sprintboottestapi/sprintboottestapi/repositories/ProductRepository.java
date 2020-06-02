package com.sprintboottestapi.sprintboottestapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sprintboottestapi.sprintboottestapi.models.Product;

/**
 *
 * @author didin
 */
public interface ProductRepository extends CrudRepository<Product, String> {
    @Override
    Product findOne(String id);

    @Override
    void delete(Product deleted);
}
