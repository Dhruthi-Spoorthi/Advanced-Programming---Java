package com.jewellery.store.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jewellery.store.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}