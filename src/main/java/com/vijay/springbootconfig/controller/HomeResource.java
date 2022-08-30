package com.vijay.springbootconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	/*
	 * 03 Adding Spring Security to new Spring Boot project
	 * 
	 * http://localhost:8080/
	 * 
	 * Username : user
	 * Password: It will get printed when application starts
	 */
	@RequestMapping("/")
	public String home() {
		return "<h1> Welcome </h1>";
	}
}
