package com.springboot.microservices.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.springboot.microservices.model.Product;

public interface ProductRepository extends MongoRepository <Product, String> {

}
