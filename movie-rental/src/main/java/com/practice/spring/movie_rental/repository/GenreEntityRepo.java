package com.practice.spring.movie_rental.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.spring.movie_rental.model.GenreEntity;

public interface GenreEntityRepo extends CrudRepository<GenreEntity, Integer>{

	GenreEntity findByGenre(String genre);
	
}
