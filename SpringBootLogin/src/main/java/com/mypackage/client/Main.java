package com.mypackage.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories("repository")
@ComponentScan("com.mypackage.controller,com.mypackage.model, exception,repository")
@EntityScan(basePackages={"com.mypackage.model"}) 
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}


 