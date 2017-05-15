package com.practice.spring.movie_rental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.movie_rental.model.GenreEntity;
import com.practice.spring.movie_rental.model.MovieEntity;
import com.practice.spring.movie_rental.repository.GenreEntityRepo;
import com.practice.spring.movie_rental.repository.MovieEntityRepo;

@RestController
public class MovieController {

	@Autowired
	private MovieEntityRepo movieEntityRepo;
	@Autowired
	private GenreEntityRepo genreEntityRepo;

	@GetMapping("/ping")
	public String ping() {
		return "home";
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<MovieEntity> movieList() {
		return (List<MovieEntity>) movieEntityRepo.findAll();
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.POST)
	public void createMovie(final MovieEntity movieEntity) {
		movieEntityRepo.save(movieEntity);
	}

	@RequestMapping(value = "/movies/{title}", method = RequestMethod.POST)
	public void deleteMovie(final String Title) {
		movieEntityRepo.deleteByTitle(Title);
	}
	
	@RequestMapping(value = "/movies/{title}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MovieEntity movieByTitle(final String Title) {
		MovieEntity movieByTitle = movieEntityRepo.findByTitle(Title);
		return movieByTitle;
	}
	
	@RequestMapping(value = "/movies/{genre}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<MovieEntity> movieByGenre(final String genre) {
		GenreEntity movieGenre = genreEntityRepo.findByGenre(genre);
		List<MovieEntity> movieByGenre = movieEntityRepo.findByGenreEntity(movieGenre);
		return movieByGenre;
	}

}
