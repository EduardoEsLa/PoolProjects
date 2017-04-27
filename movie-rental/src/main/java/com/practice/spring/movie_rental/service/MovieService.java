package com.practice.spring.movie_rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.movie_rental.model.MovieEntity;
import com.practice.spring.movie_rental.repository.MovieRepoImp;

@Service
public class MovieService {

	@Autowired
	private MovieRepoImp movieRepoImp;
	
	public void registeringNewMovie(final MovieEntity movieEntity){
		movieRepoImp.save(movieEntity);
	}
	
	public void removeMovie(final Integer Id){
		movieRepoImp.delete(Id);
	}
	
	public void updateMovie(final Integer Id){
	}
}
