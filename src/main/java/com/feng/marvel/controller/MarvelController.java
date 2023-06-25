package com.feng.marvel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.feng.marvel.response.ComicsResponse;
import com.feng.marvel.responses.CharactersResponse;
import com.feng.marvel.service.MarvelServiceImpl;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping(value="/marvel")
public class MarvelController {
	
	@Autowired
	private MarvelServiceImpl service;
	
	@GetMapping(value = "/comics")
	public ComicsResponse findAll() {
		return service.findAlls();
	}
	
	@GetMapping(value = "/heroes")
	public CharactersResponse findHeroes() {
		return service.findAll();
	}
}
