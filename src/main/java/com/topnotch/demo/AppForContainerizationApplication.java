package com.topnotch.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppForContainerizationApplication {

	@Value("${com.topnotch.message}")
	private String message;
	
	public static void main(String[] args) {
		SpringApplication.run(AppForContainerizationApplication.class, args);
	}
	
	@GetMapping()
	public String getSomething() {
		
		return message;
	}
}
