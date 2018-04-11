package com.study.spring.bingx.mapper;


import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.study.spring.bingx.dao.Test;
import java.util.List;

public interface TestMapper {

    @Select("select * from test")
    @Results({
            @Result(property = "id", column = "id")
            , @Result(property = "name", column = "name")
    })
    List<Test> getAll();



}
