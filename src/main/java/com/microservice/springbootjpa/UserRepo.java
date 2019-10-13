package com.microservice.springbootjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepo extends JpaRepository<User, Long> {

	User findByName(String name);
}
