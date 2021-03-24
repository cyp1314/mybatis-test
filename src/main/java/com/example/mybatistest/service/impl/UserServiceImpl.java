package com.example.mybatistest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatistest.config.DataSource;
import com.example.mybatistest.config.DataSourceNames;
import com.example.mybatistest.entity.User;
import com.example.mybatistest.mapper.UserMapper;
import com.example.mybatistest.service.IUserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2021-03-24 16:31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Primary
    @Override
    public boolean saveUser(User user) {
        return this.save(user);
    }

    @DataSource(DataSourceNames.TWO)
    @Override
    public boolean saveUserSalve(User user) {
        return this.save(user);
    }
}
