package com.nt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.nt")  
@EntityScan(basePackages = "com.nt") 
public class SpringJpaProj01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaProj01Application.class, args);
	}

}
