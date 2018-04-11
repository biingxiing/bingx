package com.study.spring.bingx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BingxApplication {

	public static void main(String[] args) {
		SpringApplication.run(BingxApplication.class, args);
	}
}
