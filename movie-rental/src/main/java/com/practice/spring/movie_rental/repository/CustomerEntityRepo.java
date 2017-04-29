package com.practice.spring.movie_rental.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.spring.movie_rental.model.CustomerEntity;

public interface CustomerEntityRepo extends CrudRepository<CustomerEntity, Integer> {

	public CustomerEntity findByBirthday();
}
