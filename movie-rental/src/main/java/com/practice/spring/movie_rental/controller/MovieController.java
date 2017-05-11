package com.practice.spring.movie_rental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.movie_rental.model.MovieEntity;
import com.practice.spring.movie_rental.model.UserEntity;
import com.practice.spring.movie_rental.repository.MovieEntityRepo;
import com.practice.spring.movie_rental.repository.UserEntityRepo;

@RestController
public class MovieController {

	@Autowired
	private MovieEntityRepo movieEntityRepo;
	@Autowired
	private UserEntityRepo userEntityRepo;

	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<UserEntity> userList() {
    	return (List<UserEntity>) userEntityRepo.findAll();
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<MovieEntity> movieList() {
		return (List<MovieEntity>) movieEntityRepo.findAll();
	}

/*	
	@RequestMapping(value = "/movies", method = RequestMethod.POST)
	public void createMovie(final MovieEntity movieEntity) {
		movieEntityRepo.save(movieEntity);
	}
*/
	@GetMapping("/ping")
	public String ping() {
		return "home";
	}
}
