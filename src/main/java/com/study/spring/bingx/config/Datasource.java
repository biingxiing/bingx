//package com.study.spring.bingx.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.support.SqlSessionDaoSupport;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.dao.support.DaoSupport;
//
//import javax.annotation.Resource;
//
//@Configuration
//@MapperScan(basePackage = "com.study.spring.bingx.mapper", sqlSessionFactoryRef = "sqlSessionFactory")
//public class Datasource  {
//
//    @Autowired
//    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
//        super.setSqlSessionTemplate(sqlSessionTemplate);
//    }
//
//    protected <S> S getMapper(Class<S> clazz) {
//        return getSqlSession().getMapper(clazz);
//    }
//}
