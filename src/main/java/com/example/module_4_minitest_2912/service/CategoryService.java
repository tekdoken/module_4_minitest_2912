package com.example.module_4_minitest_2912.service;

import com.example.module_4_minitest_2912.model.Category;
import com.example.module_4_minitest_2912.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository iCategoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return iCategoryRepository.findById(id);
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void remote(Long id) {

    }
}
