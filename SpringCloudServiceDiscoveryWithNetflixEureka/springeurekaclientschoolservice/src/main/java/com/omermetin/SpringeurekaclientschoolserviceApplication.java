package com.omermetin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringeurekaclientschoolserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringeurekaclientschoolserviceApplication.class, args);
	}

}
