package com.example.mybatistest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatistest.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
