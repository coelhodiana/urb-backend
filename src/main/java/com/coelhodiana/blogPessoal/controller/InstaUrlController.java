package com.coelhodiana.blogPessoal.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/instaurl")
public class InstaUrlController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/content")
	 public List<Object> getInstaUrl() {
		
		String url = "https://spreadsheets.google.com/feeds/cells/1yArnXpgx4KiAJ5lFEUk-aTauAYs6WvjDQWCNcRAqZ0Q/2/public/full?alt=json";
		Object[] objects = restTemplate.getForObject(url, Object[].class);
		
		return Arrays.asList(objects);
		
	}
	
}
