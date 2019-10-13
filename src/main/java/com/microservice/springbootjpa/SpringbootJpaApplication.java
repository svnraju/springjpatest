package com.microservice.springbootjpa;

import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(){
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("C://Users//Venkat//Downloads//springboot-jpa//springboot-jpa//src//main//resources//users.json");
//			mapper.readValue(inputStream, typeReference);
//			List<User> users = mapper.readValue(inputStream, typeReference);
			System.out.println("");
		};
	}

}
