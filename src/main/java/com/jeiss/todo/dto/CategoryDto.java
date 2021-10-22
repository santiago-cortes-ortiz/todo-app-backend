package com.jeiss.todo.dto;

import com.jeiss.todo.model.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDto {
    private Long id;

    private String name;

    private String description;

    private UserDto user;

    private List<TodoDto> todoList;

    public static Category toEntity(CategoryDto categoryDto) {
        Category category = new Category();

        category.setUser(UserDto.toEntity(categoryDto.getUser()));
        category.setId(categoryDto.getId());
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return category;
    }
}
