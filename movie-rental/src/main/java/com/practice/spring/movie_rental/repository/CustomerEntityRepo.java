package com.practice.spring.movie_rental.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.practice.spring.movie_rental.model.CustomerEntity;

public interface CustomerEntityRepo extends CrudRepository<CustomerEntity, Integer> {
	
	CustomerEntity findByBirthday(Date date);

	CustomerEntity findByName(String name);

	CustomerEntity findByUserEntityUsername(String Username);
	
	CustomerEntity deleteByUserEntityUsername(String Username);
}
