package com.java.redfood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.redfood.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}