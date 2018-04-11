package com.study.spring.bingx.web;

import com.study.spring.bingx.dao.Test;
import com.study.spring.bingx.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private TestMapper testMapper;
    @RequestMapping("/")
    public String HelloWorld() {
        List<Test> tests = testMapper.getAll();
        System.out.print(tests.get(0).getName());
        return "hello world";
    }


}
