package com.practice.spring.movie_rental.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.practice.spring.movie_rental.model.CustomerEntity;


@Repository
public class CustomerRepoImp implements CustomerEntityRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public <S extends CustomerEntity> S save(S entity) {
		return null;
	}

	@Override
	public <S extends CustomerEntity> Iterable<S> save(Iterable<S> entities) {
		return null;
	}

	@Override
	public CustomerEntity findOne(Integer id) {
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		return false;
	}

	@Override
	public Iterable<CustomerEntity> findAll() {
		return null;
	}

	@Override
	public Iterable<CustomerEntity> findAll(Iterable<Integer> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void delete(Integer id) {
		
	}

	@Override
	public void delete(CustomerEntity entity) {
		
	}

	@Override
	public void delete(Iterable<? extends CustomerEntity> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}

}
