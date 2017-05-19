package com.practice.spring.movie_rental.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.spring.movie_rental.model.UserEntity;

public interface UserEntityRepo extends CrudRepository<UserEntity, Integer> {

	void deleteByUsername(String Username);
	
}
