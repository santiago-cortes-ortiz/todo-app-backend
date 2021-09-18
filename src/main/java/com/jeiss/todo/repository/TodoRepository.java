package com.jeiss.todo.repository;

import com.jeiss.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo,Long> {
    List<Todo> findTodoByCategoryId(Long categoryId);
}
