package com.vijay.springbootconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	/*
	 * 06 How Spring Security Authentication works 
	 * 
	 * http://localhost:8080/
	 * 
	 * Can be accessible by user and admin role
	 * http://localhost:8080/user
	 * 
	 * Can be accessible by admin role
	 * http://localhost:8080/admin
	 * 
	 * This is set into SecurityConfiguration.java
	 * Username : vijay (user role) and ajay  (admin role)
	 * Password: pass and pass
	 */
	@RequestMapping("/")
	public String home() {
		return "<h1> Welcome </h1>";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "<h1> Welcome User </h1>";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "<h1> Welcome Admin </h1>";
	}
}
