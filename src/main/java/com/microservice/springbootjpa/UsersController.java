package com.microservice.springbootjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	@Autowired
	UserRepo userRepo;
	@GetMapping(value="/all")
	public List<User> findAll(){
		return userRepo.findAll();
		
	}
	@GetMapping(value = "/{name}")
	public User findByName(@PathVariable final String name){
		return userRepo.findByName(name);
	}
	@PostMapping(value="/load")
	public User load(@RequestBody final User user){
		userRepo.save(user);
		return userRepo.findByName(user.getName());
	}
	@GetMapping(value="/testRester")
	public String test(){
		return "welcome";
		
	}

}
