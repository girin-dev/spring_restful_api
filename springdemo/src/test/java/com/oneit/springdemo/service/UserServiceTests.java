package com.oneit.springdemo.service;

import com.oneit.springdemo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @Test
    public void testRegistUser(){
        User user = new User(1000,"kkkim");
        User res = userService.registUser(user);
        // 에러가 발생하지 않으면 테스트를 통과한다는 것으로 Assert를 사용하지 않을 수 있음
    }
}