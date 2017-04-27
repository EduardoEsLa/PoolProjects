package com.practice.spring.movie_rental.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.practice.spring.movie_rental.model.UserEntity;


@Repository
public class UserRepoImp implements UserEntityRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public <S extends UserEntity> S save(S entity) {
		return null;
	}

	@Override
	public <S extends UserEntity> Iterable<S> save(Iterable<S> entities) {
		return null;
	}

	@Override
	public UserEntity findOne(Integer id) {
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		return false;
	}

	@Override
	public Iterable<UserEntity> findAll() {
		return null;
	}

	@Override
	public Iterable<UserEntity> findAll(Iterable<Integer> ids) {
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
	public void delete(UserEntity entity) {
		
	}

	@Override
	public void delete(Iterable<? extends UserEntity> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}

}
