package com.educandoweb.pauloprojeto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.pauloprojeto.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Paulo", "pauloedu@gmail.com", "87458962", "12345");
		return ResponseEntity.ok().body(u);
	}

}
