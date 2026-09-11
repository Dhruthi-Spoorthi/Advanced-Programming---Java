package com.jewellery.store.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jewellery.store.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}