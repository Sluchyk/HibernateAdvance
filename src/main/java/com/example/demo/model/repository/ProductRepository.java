package com.example.demo.model.repository;

import com.example.demo.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
