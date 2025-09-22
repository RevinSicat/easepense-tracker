package com.ease.easepensetracker.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ease.easepensetracker.model.Category;
import com.ease.easepensetracker.repository.CategoryRepository;

import jakarta.transaction.Transactional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Transactional
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Transactional
    public void deleteCategory(String id) {
        categoryRepository.deleteById(id);
    }

    public Optional<Category> getCategoryById(String id) {
        return categoryRepository.findById(id);
    }
}
