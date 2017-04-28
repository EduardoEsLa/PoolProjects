package com.practice.spring.movie_rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.movie_rental.model.MovieEntity;
import com.practice.spring.movie_rental.repository.MovieEntityRepo;

@Service
public class MovieService {

	@Autowired
	private MovieEntityRepo movieEntityRepo;
	
	public void savingNewMovie(final MovieEntity movieEntity){
		movieEntityRepo.save(movieEntity);
	}
	
	public void removingMovie(final Integer Id){
		movieEntityRepo.delete(Id);
	}

	public void removingByTitle(final String Title){
		movieEntityRepo.deleteByTitle(Title);
	}
	
	public MovieEntity findingMovieById(final Integer Id){
		return movieEntityRepo.findOne(Id);
	}
	
	public MovieEntity findingMovieByTitle(final String Title){
		return movieEntityRepo.findByTitle(Title);
	}
	
	public Iterable<MovieEntity> listMovies(){
		return movieEntityRepo.findAll();
	}
	
	public MovieEntity findingMovieByGenre(final String genre){
		return null;
	}
}
