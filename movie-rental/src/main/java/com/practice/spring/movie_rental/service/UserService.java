package com.practice.spring.movie_rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.movie_rental.model.UserEntity;
import com.practice.spring.movie_rental.repository.UserEntityRepo;

@Service
public class UserService {

	@Autowired
	private UserEntityRepo userEntityRepo;
	
	/**
	 * Method to save or update a new user.
	 * @param userEntity
	 */
	public void savingUser(final UserEntity userEntity){
		userEntityRepo.save(userEntity);
	}
	
	/**
	 * Method to get the number of users.
	 * @return number of users
	 */
	public long accountUsers(){
		return userEntityRepo.count();
	}
	
	/**
	 * Method to get a collection of users.
	 * @return colection of users.
	 */
	public Iterable<UserEntity> findingUsers(){
		return userEntityRepo.findAll();
	}
}
