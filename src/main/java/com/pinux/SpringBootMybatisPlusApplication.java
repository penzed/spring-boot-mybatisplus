package com.pinux;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pinux.mapper")
public class SpringBootMybatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisPlusApplication.class, args);
	}

}
