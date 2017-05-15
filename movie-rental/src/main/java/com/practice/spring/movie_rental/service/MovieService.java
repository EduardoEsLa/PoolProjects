package com.practice.spring.movie_rental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.movie_rental.model.MovieEntity;
import com.practice.spring.movie_rental.repository.MovieEntityRepo;

@Service
public class MovieService {

	@Autowired
	private MovieEntityRepo movieEntityRepo;
	
	/**
	 * Method to save a new or existing book.
	 * @param movieEntity
	 */
	public void savingNewMovie(final MovieEntity movieEntity){
		movieEntityRepo.save(movieEntity);
	}
	
	/**
	 * Method to remove a movie by Id.
	 * @param Id
	 */
	public void removingMovie(final Integer Id){
		movieEntityRepo.delete(Id);
	}

	/**
	 * Method to remove a movie by Title.
	 * @param Title
	 */
	public void removingMovieByTitle(final String Title){
		movieEntityRepo.deleteByTitle(Title);
	}
	
	/**
	 * Method to list all the movies.
	 * @return collection of movies.
	 */
	public Iterable<MovieEntity> listMovies(){
		return movieEntityRepo.findAll();
	}
	
	/**
	 * Method to find a movie by Id.
	 * @param Id
	 * @return movie by Id
	 */
	public MovieEntity findingMovieById(final Integer Id){
		return movieEntityRepo.findOne(Id);
	}
	
	/**
	 * Method to find a movie by Title.
	 * @param Title
	 * @return movie
	 */
	public MovieEntity findingMovieByTitle(final String Title){
		return movieEntityRepo.findByTitle(Title);
	}
	
	
	/**
	 * Method to find list of movies by genre.
	 * @param genreEntity
	 * @return list of movies
	 */
	public List<MovieEntity> findingMovieByGenre(final String Description){
		return movieEntityRepo.findByGenreEntity(g);
	}
	
}
