package com.oneit.springdemo.dao;

import com.oneit.springdemo.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
// 모든 퍼블릭 메소드에 대한 테스트 케이스를 만들어야 함

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testGetAllUsers() {
        List<User> res = userRepository.getAllUsers();

        Assert.assertTrue(res.size() > 0); // 인자값으로 들어온 조건을 만족하면 해당 메소드가 정상이다라고 하는 것
    }

    @Test
    public void testGetUserByUserid() {
        User user = userRepository.getUserByUserid(100);
        Assert.assertNotNull(user); // 인자값이 NULL이 아니면 해당 메소드가 정상이다라고 하는 것
    }
}
