package com.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootConfiguration
public class SpringAppStarter {

	public static void main(String[] args) {
              
		SpringApplication.run(SpringAppStarter.class, args);
	}
}
