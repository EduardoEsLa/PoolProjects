package com.practice.spring.movie_rental.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.movie_rental.model.CustomerEntity;
import com.practice.spring.movie_rental.repository.CustomerEntityRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerEntityRepo customerEntityRepo;
	
	/**
	 * Method to save a customer.
	 * @param customerEntity
	 */
	public void savingCustomer(final CustomerEntity customerEntity){
		customerEntityRepo.save(customerEntity);
	}
	
	public CustomerEntity findingCustomerById(final Integer Id){
		return customerEntityRepo.findOne(Id);
	}
	
	/**
	 * Method to get a customer according the birthday.
	 * @param date TODO
	 * @return customer
	 */
	public CustomerEntity gettingCustomerByBirthday(Date date) {
		return customerEntityRepo.findByBirthday(date);
	}
}
