package com.practice.spring.movie_rental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.movie_rental.model.CustomerEntity;
import com.practice.spring.movie_rental.repository.CustomerEntityRepo;

@RestController
public class CustomerController {

	@Autowired
	private CustomerEntityRepo customerEntityRepo;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<CustomerEntity> customersList() {
    	return (List<CustomerEntity>) customerEntityRepo.findAll();
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public void creatingCustomer(CustomerEntity customerEntity) {
		customerEntityRepo.save(customerEntity);
	}

	@RequestMapping(value = "/customers/{username}", method = RequestMethod.GET)
	public @ResponseBody CustomerEntity findingCustomerByUsername(String username) {
		CustomerEntity customerByUsername = customerEntityRepo.findByUserEntityUsername(username);
		return customerByUsername;
	}
	
	@RequestMapping(value = "/customers/{username}", method = RequestMethod.POST)
	public void deletingCustomer(String username) {
		customerEntityRepo.deleteByUserEntityUsername(username);
	}

}
