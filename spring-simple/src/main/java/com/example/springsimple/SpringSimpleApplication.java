package com.example.springsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SpringSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSimpleApplication.class, args);
	}

}
