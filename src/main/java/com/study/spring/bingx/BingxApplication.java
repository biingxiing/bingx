package com.study.spring.bingx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("com.study.spring.bingx.mapper")
@EnableScheduling
public class BingxApplication {

	public static void main(String[] args) {
		SpringApplication.run(BingxApplication.class, args);
	}
}
