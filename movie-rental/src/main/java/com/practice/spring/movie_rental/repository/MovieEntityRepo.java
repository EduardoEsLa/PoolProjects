package com.practice.spring.movie_rental.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.practice.spring.movie_rental.model.MovieEntity;


public interface MovieEntityRepo extends CrudRepository<MovieEntity, Integer> {
	
	@Query("DELETE movie FROM Movie WHERE movie.title = :Title")
	public void deleteByTitle(@Param("Title") String Title);
	
	@Query("SELECT movie FROM Movie WHERE movie.title = :Title")
	public MovieEntity findByTitle(@Param("Title") String Title);
}
