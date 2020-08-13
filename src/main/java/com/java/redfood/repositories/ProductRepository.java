package com.java.redfood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.redfood.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}