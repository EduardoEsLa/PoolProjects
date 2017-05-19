package com.practice.spring.movie_rental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.movie_rental.model.UserEntity;
import com.practice.spring.movie_rental.repository.UserEntityRepo;

@RestController
public class UsersController {

	@Autowired
	private UserEntityRepo userEntityRepo;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<UserEntity> userList() {
    	return (List<UserEntity>) userEntityRepo.findAll();
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void creatingUser(final UserEntity userEntity) {
		userEntityRepo.save(userEntity);
	}
	
	@RequestMapping(value = "/users/{username}", method = RequestMethod.POST)
	public void deletingByUsername(final String username) {
		userEntityRepo.deleteByUsername(username);
	}
	
}
