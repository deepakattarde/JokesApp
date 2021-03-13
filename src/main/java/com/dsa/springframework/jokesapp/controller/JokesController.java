package com.dsa.springframework.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dsa.springframework.jokesapp.service.JokesService;

@Controller
public class JokesController {

	private JokesService jokesService;
	
	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}


	@RequestMapping("/joke")
	public String getJoke(Model model) {
		model.addAttribute("joke", jokesService.getJoke());
		
		return "joke/list";
	}
}
