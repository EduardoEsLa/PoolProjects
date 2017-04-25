package com.practice.spring.movie_rental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {

	@GetMapping("/ping")
	@ResponseBody
	public String ping() {
		return "pong";
	}
}
