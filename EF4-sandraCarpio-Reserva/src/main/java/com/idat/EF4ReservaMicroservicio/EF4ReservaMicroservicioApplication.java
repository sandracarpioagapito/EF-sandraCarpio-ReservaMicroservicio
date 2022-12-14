package com.idat.EF4ReservaMicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EF4ReservaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EF4ReservaMicroservicioApplication.class, args);
	}

}
