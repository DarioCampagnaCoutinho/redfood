package com.java.redfood.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.redfood.domain.Category;
import com.java.redfood.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> categoryId = categoryRepository.findById(id);
        return categoryId.get();
    }

}