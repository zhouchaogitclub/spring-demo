package com.zc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 周超
 * @since 2020/7/25 19:18
 */
@SpringBootApplication
@MapperScan("com.zc.dao")
public class MybatisDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
	}
}
