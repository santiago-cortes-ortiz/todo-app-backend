package com.jeiss.todo.service;

import com.jeiss.todo.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);
    List<UserDto> findAll();
    UserDto findById(Long id);
    void delete(Long id);
    UserDto login(UserDto userDto);
}
