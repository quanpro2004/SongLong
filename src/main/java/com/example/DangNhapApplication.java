package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class DangNhapApplication {

	public static void main(String[] args) {
		SpringApplication.run(DangNhapApplication.class, args);
	}

}
