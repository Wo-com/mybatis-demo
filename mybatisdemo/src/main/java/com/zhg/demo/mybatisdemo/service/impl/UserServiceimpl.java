package com.zhg.demo.mybatisdemo.service.impl;

import com.zhg.demo.mybatisdemo.entity.User;
import com.zhg.demo.mybatisdemo.mapper.UserMapper;
import com.zhg.demo.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {

    /**
     * mybatis 实现
     */
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}