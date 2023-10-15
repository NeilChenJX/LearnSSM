package com.example.mybatis.mapper;

import com.example.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();

}
