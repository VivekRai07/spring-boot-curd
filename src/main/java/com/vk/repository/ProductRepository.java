package com.vk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vk.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {


	

}
