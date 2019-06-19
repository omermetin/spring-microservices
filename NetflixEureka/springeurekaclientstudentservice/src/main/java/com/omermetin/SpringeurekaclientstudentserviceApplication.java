package com.omermetin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringeurekaclientstudentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringeurekaclientstudentserviceApplication.class, args);
	}

}
