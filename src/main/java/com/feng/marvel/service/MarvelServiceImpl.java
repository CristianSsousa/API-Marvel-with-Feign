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
	private final String PUBLIC_KEY = "3aaaa50b386764e7c624fa360ccf55c4";
	private final String PRIVATE_KEY = "47797c7b040d1f421be77aca0a53624048e6f825";
	
	
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
