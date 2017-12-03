package com.jks.startup.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayAWordController {
	
	@RequestMapping("/say-{word}")
	public String sayAWord (@PathVariable String word){
		return "Hi " + word+"!!";
	}

}
