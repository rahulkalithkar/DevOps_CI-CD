package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsDemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DevOpsDemoApplication.class);

	public static void main(String[] args) {
		log.info("Main method has been invoked"); 
		SpringApplication.run(DevOpsDemoApplication.class, args);
		System.out.println("App running");
	}

}
