package com.dsa.springframework.jokesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesService {

	private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
		
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
