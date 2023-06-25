package com.feng.marvel.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.feng.marvel.response.ComicsResponse;
import com.feng.marvel.responses.CharactersResponse;

@FeignClient(name= "comics", url = "https://gateway.marvel.com/v1/public")
public interface MarvelComicsClient {
	
	@GetMapping("/comics")
	public ComicsResponse findAll(@RequestParam(value="ts")Long timeStamp,
			 					  @RequestParam(value="apikey") String publicKey,
			 					  @RequestParam(value="hash") String hash);
	@GetMapping("/characters")
	public CharactersResponse heroes (@RequestParam(value="ts")Long timeStamp,
				 					 @RequestParam(value="apikey") String publicKey,
				 				     @RequestParam(value="hash") String hash);
	
	
}
