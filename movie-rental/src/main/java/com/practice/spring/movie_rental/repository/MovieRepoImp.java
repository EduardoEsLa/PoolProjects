package com.practice.spring.movie_rental.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.practice.spring.movie_rental.model.MovieEntity;

@Repository
public class MovieRepoImp implements MovieEntityRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public <S extends MovieEntity> S save(S entity) {
		return null;
	}

	@Override
	public <S extends MovieEntity> Iterable<S> save(Iterable<S> entities) {
		return null;
	}

	@Override
	public MovieEntity findOne(Integer id) {
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		return false;
	}

	@Override
	public Iterable<MovieEntity> findAll() {
		return null;
	}

	@Override
	public Iterable<MovieEntity> findAll(Iterable<Integer> ids) {
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
	public void delete(MovieEntity entity) {
		
	}

	@Override
	public void delete(Iterable<? extends MovieEntity> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}

}
