package com.practice.spring.movie_rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.movie_rental.repository.UserEntityRepo;

@RestController
public class MovieController {

	@Autowired
	private UserEntityRepo userEntityRepo;

	@GetMapping("/ping")
	public String ping(Model model) {
		model.addAttribute("users", userEntityRepo.findAll());
		return "home";
	}
}
