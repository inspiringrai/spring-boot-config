package com.springboot.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ConfigClientJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientJdbcApplication.class, args);
	}

}
