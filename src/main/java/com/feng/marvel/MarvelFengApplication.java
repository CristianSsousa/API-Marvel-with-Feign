package com.feng.marvel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class MarvelFengApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelFengApplication.class, args);
	}
 
}
