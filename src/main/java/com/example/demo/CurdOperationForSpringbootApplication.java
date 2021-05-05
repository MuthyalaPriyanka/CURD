package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

/*@ComponentScan({ "com.example.demo.controller","com.example.demo.employeeservice"})
@EnableJpaRepositories("com.example.demo.Repository")
@EntityScan("com.example.demo.entities")*/
public class CurdOperationForSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdOperationForSpringbootApplication.class, args);
	}

}
