package com.practice.spring.movie_rental.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.spring.movie_rental.model.MovieEntity;


public interface MovieEntityRepo extends CrudRepository<MovieEntity, Integer> {


}
