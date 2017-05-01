package com.practice.spring.movie_rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.practice.spring.movie_rental.repository.UserEntityRepo;

@Controller
public class MovieController {

	@Autowired
	private UserEntityRepo userEntityRepo;

	@GetMapping("/ping")
	public String ping(Model model) {
		return "pong";
/*		model.addAttribute("users", userEntityRepo.findAll());
		return "home";
*/
	}
}
