package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.example.demo")
//@RestController("com.example.demo.controller")

public class CurdOperationForSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdOperationForSpringbootApplication.class, args);
	}

}
