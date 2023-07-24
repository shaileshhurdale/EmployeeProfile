package com.example.EmployeeProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class EmployeeProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProfileApplication.class, args);
	}

}
