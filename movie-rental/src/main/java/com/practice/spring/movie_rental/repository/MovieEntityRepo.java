package com.practice.spring.movie_rental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.practice.spring.movie_rental.model.MovieEntity;

public interface MovieEntityRepo extends CrudRepository<MovieEntity, Integer> {

	public void deleteByTitle(String Title);

	public MovieEntity findByTitle(String Title);

	public List<MovieEntity> findByDescription(String description);
}
