package com.feng.marvel.service;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.marvel.client.MarvelComicsClient;
import com.feng.marvel.response.ComicsResponse;
import com.feng.marvel.responses.CharactersResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarvelServiceImpl {
	private final String PUBLIC_KEY = //API_KEY;
	private final String PRIVATE_KEY = //API_KEY;
	
	
	@Autowired
	private MarvelComicsClient marvelComicsClient;
	
	
	private static final Logger logger = LoggerFactory.getLogger(MarvelServiceImpl.class);

	
	public ComicsResponse findAlls() {
		Long timeStamp = new Date().getTime();
		logger.info("Cheguei Comics");
		return marvelComicsClient.findAll(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
	}
	
	
	public CharactersResponse findAll() {
		logger.info("Cheguei Heroes");
		Long timeStamp = new Date().getTime();
		return marvelComicsClient.heroes(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
	}
	
	
	
	private String buildHash(Long timeStamp) {
		return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);
	}
	
	
}
