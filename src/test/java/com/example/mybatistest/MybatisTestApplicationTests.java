package com.example.mybatistest;

import com.example.mybatistest.entity.User;
import com.example.mybatistest.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class MybatisTestApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    public void save(){
        User user = User.builder().name("李白").build();
        boolean b = userService.saveUser(user);
        log.debug(String.valueOf(b));
    }

    @Test
    public void saveSalve(){
        User user = User.builder().name("杜甫").build();
        boolean b = userService.saveUserSalve(user);
        log.debug(String.valueOf(b));
    }

}
