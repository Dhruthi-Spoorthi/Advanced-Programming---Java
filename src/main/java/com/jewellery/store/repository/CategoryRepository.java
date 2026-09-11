package com.jewellery.store.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jewellery.store.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
}