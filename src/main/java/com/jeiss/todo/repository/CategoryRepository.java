package com.jeiss.todo.repository;

import com.jeiss.todo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    List<Category> findCategoryByUserId(Long userId);
}
