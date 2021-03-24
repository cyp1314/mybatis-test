package com.example.mybatistest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatistest.entity.User;

public interface IUserService extends IService<User> {
    boolean saveUser(User user);
    boolean saveUserSalve(User user);
}
