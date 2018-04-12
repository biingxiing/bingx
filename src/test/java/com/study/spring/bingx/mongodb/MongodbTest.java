package com.study.spring.bingx.mongodb;

import com.study.spring.bingx.dao.UserEntity;
import com.study.spring.bingx.mapper.UserImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbTest {

    @Autowired
    private UserImpl user;

    @Test
    public void save() {
        UserEntity userEntity = new UserEntity();

        userEntity.setId(0L);
        userEntity.setUserName("bingxing");
        userEntity.setPassWord("112344");
        user.saveUser(userEntity);
    }
}
