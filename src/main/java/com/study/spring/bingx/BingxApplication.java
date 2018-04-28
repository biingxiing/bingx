package com.study.spring.bingx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
//自动开启数据库
@MapperScan("com.study.spring.bingx.mapper")
//开启定时任务的注解
@EnableScheduling
//注册中心开启
@EnableEurekaServer
public class BingxApplication {

	public static void main(String[] args) {
		SpringApplication.run(BingxApplication.class, args);
	}
}
