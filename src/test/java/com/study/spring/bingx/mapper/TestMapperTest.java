package com.study.spring.bingx.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperTest {

    @Autowired
    private TestMapper testMapper;
    @Test
    public void getAll() {
        List<com.study.spring.bingx.dao.Test> testList = testMapper.getAll();
        System.out.print(testList);
    }
}