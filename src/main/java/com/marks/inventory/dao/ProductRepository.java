package com.marks.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.marks.inventory.model.Product;



public interface ProductRepository extends CrudRepository<Product, String> {

}