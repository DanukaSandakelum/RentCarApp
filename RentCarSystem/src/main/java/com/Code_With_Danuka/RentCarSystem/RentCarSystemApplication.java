package com.Code_With_Danuka.RentCarSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.Code_With_Danuka.entity") // Add this line
public class RentCarSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(RentCarSystemApplication.class, args);
	}
}
