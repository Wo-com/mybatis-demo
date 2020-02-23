package com.zhg.demo.mybatisdemo.mapper;

import com.zhg.demo.mybatisdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface UserMapper {
    List<User> findAll();
}