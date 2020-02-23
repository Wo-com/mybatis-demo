package com.zhg.demo.mybatisdemo.service;

import com.zhg.demo.mybatisdemo.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}