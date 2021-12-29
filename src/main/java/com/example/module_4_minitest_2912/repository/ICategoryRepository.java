package com.example.module_4_minitest_2912.repository;

import com.example.module_4_minitest_2912.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
